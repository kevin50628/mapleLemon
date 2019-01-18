package handling.cashshop.handler;

import client.MapleCharacter;
import client.MapleClient;
import handling.cashshop.CashShopServer;
import handling.channel.ChannelServer;
import handling.login.LoginServer;
import handling.world.CharacterTransfer;
import handling.world.World;
import java.util.List;

import tools.MapleLogger;
import tools.MaplePacketCreator;
import tools.data.input.SeekableLittleEndianAccessor;
import tools.packet.MTSCSPacket;

public class CashShopOperation {

    /**
     * 玩家离开商城
     * @param slea
     * @param c
     * @param chr
     */
    public static void LeaveCS(SeekableLittleEndianAccessor slea, MapleClient c, MapleCharacter chr) {
        if (chr == null) {
            return;
        }
        int channel = c.getChannel();
        ChannelServer toch = ChannelServer.getInstance(channel);
        if (toch == null) {
            MapleLogger.info(new StringBuilder().append("玩家: ").append(chr.getName()).append(" 从商城离开发生错误.找不到频道[").append(channel).append("]的信息.").toString());
            c.getSession().close();
            return;
        }

        World.ChannelChange_Data(new CharacterTransfer(chr), chr.getId(), c.getChannel());
        CashShopServer.getPlayerStorage().deregisterPlayer(chr);
        c.updateLoginState(MapleClient.LOGIN_SERVER_TRANSITION, c.getSessionIPAddress());
        String s = c.getSessionIPAddress();
        LoginServer.addIPAuth(s.substring(s.indexOf('/') + 1, s.length()));
        c.sendPacket(MaplePacketCreator.getChannelChange(c, Integer.parseInt(toch.getIP().split(":")[1])));
        chr.saveToDB(false, true);
        c.setPlayer(null);
        c.setReceiving(false);
    }

    /**
     * 玩家进入商城
     * @param transfer
     * @param c
     */
    public static void EnterCS(CharacterTransfer transfer, MapleClient c) {
        if (transfer == null) {
            MapleLogger.info("玩家为空："+c.getPlayer().getAccountID());
            c.getSession().close();
            return;
        }
        MapleCharacter chr = MapleCharacter.ReconstructChr(transfer, c, false);

        c.setPlayer(chr);
        c.setAccID(chr.getAccountID());

        if (!c.CheckIPAddress()) {
            c.getSession().close();
            MapleLogger.info(new StringBuilder().append("商城检测连接 - 2 ").append(!c.CheckIPAddress()).toString());
            return;
        }

        int state = c.getLoginState();
        boolean allowLogin = false;
        if (((state == 1) || (state == 3))
                && (!World.isCharacterListConnected(c.loadCharacterNames(c.getWorld())))) {
            allowLogin = true;
        }

        if (!allowLogin) {
            c.setPlayer(null);
            c.getSession().close();
            MapleLogger.info(new StringBuilder().append("商城检测连接 - 3 ").append(!allowLogin).toString());
            return;
        }
        c.updateLoginState(MapleClient.LOGIN_LOGGEDIN, c.getSessionIPAddress());
        CashShopServer.getPlayerStorage().registerPlayer(chr);
        c.sendPacket(MTSCSPacket.warpchartoCS(c));

        c.sendPacket(MTSCSPacket.商城道具栏信息(c));
        List gifts = chr.getCashInventory().loadGifts();
//        c.sendPacket(MTSCSPacket.商城礼物信息(c, gifts));
//        c.sendPacket(MTSCSPacket.商城购物车(c.getPlayer(), false));

        c.sendPacket(MTSCSPacket.刷新点券信息(c.getPlayer()));
//        c.getPlayer().getCashInventory().checkExpire(c);
    }

    public static void CSUpdate(MapleClient c) {

    }

}


