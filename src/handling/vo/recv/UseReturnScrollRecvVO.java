package handling.vo.recv;


import client.MapleClient;
import handling.vo.MaplePacketRecvVO;
import tools.data.input.SeekableLittleEndianAccessor;

public class UseReturnScrollRecvVO extends MaplePacketRecvVO {

    Short slot;
    Integer itemId;

    @Override
    public void decodePacket(SeekableLittleEndianAccessor slea, MapleClient c) {
        slot = slea.readShort();
        itemId = slea.readInt();
    }

    public Short getSlot() {
        return slot;
    }

    public Integer getItemId() {
        return itemId;
    }
}