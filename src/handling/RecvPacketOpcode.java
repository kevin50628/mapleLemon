package handling;

public enum RecvPacketOpcode implements WritableIntValueHolder {
    // The name must follow the rule:handleType_handleClass

    LOGIN_LOGIN_PASSWORD(0x01,false),
    LOGIN_SET_GENDER(0x02),
    LOGIN_SERVER_STATUS_REQUEST(0x03),
    LOGIN_CHARLIST_REQUEST(0x04),
    LOGIN_CHAR_SELECT(0x05),
    LOGIN_PLAYER_ENTER_GAME(0x06,false),
    LOGIN_CHECK_CHAR_NAME(0x07),
    LOGIN_CHECK_CAN_REGISTER(0x08),
    LOGIN_CHECK_ACCOUNT(0x09),
    LOGIN_REGISTER_ACCOUNT(0x0A,false),
    LOGIN_CREATE_CHAR(0x0B),
//    LOGIN_PONG(0x0D,false),
    LOGIN_CLIENT_ERROR(0x0E,false),
//
//    LOGIN_STRANGE_DATA(0x12);

    CHANNEL_CHANGE_MAP(0x15),
    CHANNEL_CHANGE_CHANNEL(0x16),
    CHANNEL_ENTER_CASH_SHOP(0x17),
    CHANNEL_MOVE_PLAYER(0x18),
    CHANNEL_USE_CHAIR(0x19),
    CHANNEL_CLOSE_RANGE_ATTACK(0x1A),
    CHANNEL_RANGE_ATTACK(0x1B),
    CHANNEL_MAGIC_ATTACK(0x1C),
    CHANNEL_PLAYER_TAKE_DAMAGE(0x1E),
    CHANNEL_GENERAL_CHAT(0x1F),
    CHANNEL_FACE_EXPRESSION(0x20),

    CHANNEL_NPC_TALK(0x23),
    CHANNEL_NPC_TALK_MORE(0x24),
    CHANNEL_OPEN_NPC_SHOP(0x25),
    CHANNEL_OPEN_STORAGE(0x26),
    CHANNEL_ITEM_MOVE(0x27),
    CHANNEL_USE_ITEM(0x28),
    CHANNEL_USE_SUMMON_BAG(0x29),
    CHANNEL_USE_PET_FOOD(0x2A),
    CHANNEL_USE_CASH_ITEM(0x2B),
    CHANNEL_USE_RETURN_SCROLL(0x2C),
    CHANNEL_USE_UPGRADE_SCROLL(0x2D),
    CHANNEL_DISTRIBUTE_AP(0x2E),
    CHANNEL_HEAL_OVER_TIME(0x2F),
    CHANNEL_DISTRIBUTE_SP(0x30),
    CHANNEL_SPECIAL_SKILL(0x31),
    CHANNEL_CANCEL_BUFF(0x32),
    CHANNEL_SKILL_EFFECT(0x33),
    CHANNEL_MESO_DROP(0x34),
    CHANNEL_CHAR_INFO_REQUEST(0x37),
    CHANNEL_SPAWN_PET(0x38),
    CHANNEL_CHANGE_MAP_SPECIAL(0x3A),
    CHANNEL_TROCK_ADD_MAP(0x3B),
    CHANNEL_USE_DOOR(0x49),
    CHANNEL_PET_MOVE(0x4C),
    CHANNEL_PET_LOOT(0x4F),
    CHANNEL_SUMMON_MOVE(0x52),
    CHANNEL_SUMMON_ATTACK(0x53),
    CHANNEL_SUMMON_DAMAGE(0x54),
    CHANNEL_SUMMON_SUB(0x55),
    CHANNEL_SUMMON_REMOVE(0x55),
    CHANNEL_MOVE_LIFE(0x5A),
    CHANNEL_NPC_ACTION(0x5F),
    CHANNEL_ITEM_PICKUP(0x63),

    CASHSHOP_CS_UPDATE(0x72),
    CASHSHOP_BUY_CASH_ITEM(0x73),
    CASHSHOP_COUPON_CODE(0x74);

//    SERVERLIST_REQUEST,
//    CANCEL_CHAIR,
//    PASSIVE_ATTACK,
//    CLIENT_HELLO(false),
//    CLOSE_CHALKBOARD,
//    UPDATE_CHANNEL,
//    DELETE_CHAR,
//    GET_SERVER(false),
//    CREATE_ULTIMATE,
//    FACE_ANDROID,
//    USE_ITEM_EFFECT,
//    WHEEL_OF_FORTUNE,
//    USE_TITLE_EFFECT,
//    USE_UNK_EFFECT,
//    AUTH_SECOND_PASSWORD,
//    SET_WORK,
//    ENTER,
//    USE_ADDITIONAL_ITEM,
//    ALLOW_PET_LOOT,
//    ALLOW_PET_AOTO_EAT,
//    USE_CATCH_ITEM,
//    USE_SKILL_BOOK,
//    USE_MOUNT_FOOD,
//    USE_SCRIPTED_NPC_ITEM,
//    USE_RECIPE,
//    USE_ALIEN_SOCKET,
//    USE_ALIEN_SOCKET_RESPONSE,
//    LICENSE_REQUEST,
//    REMOTE_STORE,
//    CHAR_CARD,
//    SET_ACC_CASH,
//    LOAD_PLAYER_SCCUCESS,
//    QUICK_BUY_CS_ITEM,
//    MOVE_BAG,
//    SWITCH_BAG,
//    CANCEL_ITEM_EFFECT,
//    SEND_ENCRYPTED(false),
//    REDISPLAY_SERVERLIST,
//    VIEW_ALL_CHAR,
//    VIEW_REGISTER_PIC,
//    VIEW_SELECT_PIC,
//    PICK_ALL_CHAR,
//    CHAR_SELECT_NO_PIC,
//    VIEW_SERVERLIST,
//    PACKET_ERROR(false),
//    CLIENT_START(false),
//    CLIENT_FAILED(false),
//
//    USE_HIRED_MERCHANT,
//    MERCH_ITEM_STORE,
//    DUEY_ACTION,
//    MECH_CANCEL,
//    USE_HOLY_FOUNTAIN,
//    OWL,
//    OWL_WARP,
//    ITEM_SORT,
//    ITEM_GATHER,
//    GIVE_FAME,
//    USE_SP_RESET,
//    USE_AP_RESET,
//    POTION_POT_USE,
//    POTION_POT_ADD,
//    POTION_POT_MODE,
//    POTION_POT_INCR,
//    USE_OWL_MINERVA,
//    USE_TELE_ROCK,
//
//
//    USE_FLAG_SCROLL,
//    USE_EQUIP_SCROLL,
//    USE_POTENTIAL_SCROLL,
//    USE_POTENTIAL_ADD_SCROLL,
//    USE_SOULS_SCROLL,
//    USE_SOUL_MARBLE,
//    USE_BAG,
//    USE_MAGNIFY_GLASS,
//    USE_CARVED_SEAL,
//
//    AUTO_ASSIGN_AP,
//
//    TEACH_SKILL,
//
//
//    AFTER_SKILL,
//
//    CANCEL_DEBUFF,
//    UNK0A3,
//    USE_INNER_PORTAL,
//    LIE_DETECTOR,
//    LIE_DETECTOR_SKILL,
//    LIE_DETECTOR_RESPONSE,
//    LIE_DETECTOR_REFRESH,
//    QUEST_ACTION,
//    REISSUE_MEDAL,
//    SPECIAL_ATTACK,
//    REWARD_ITEM,
//    ITEM_MAKER,
//    REPAIR_ALL,
//    REPAIR,
//    SOLOMON,
//    GACH_EXP,
//    FOLLOW_REQUEST,
//    FOLLOW_REPLY,
//    AUTO_FOLLOW_REPLY,
//    REPORT,
//    PROFESSION_INFO,
//    USE_POT,
//    CLEAR_POT,
//    FEED_POT,
//    CURE_POT,
//    REWARD_POT,
//    USE_COSMETIC,
//    USE_REDUCER,
//    CHANGE_ZERO_LOOK,
//    CHANGE_ZERO_LOOK_END,
//    PARTYCHAT,
//    WHISPER,
//    MESSENGER,
//    PLAYER_INTERACTION,
//    PARTY_OPERATION,
//    DENY_PARTY_REQUEST,
//    ALLOW_PARTY_INVITE,
//    GUILD_OPERATION,
//    DENY_GUILD_REQUEST,
//    JOIN_GUILD_REQUEST,
//    JOIN_GUILD_CANCEL,
//    ALLOW_GUILD_JOIN,
//    DENY_GUILD_JOIN,
//    ADMIN_COMMAND,
//    ADMIN_LOG,
//    BUDDYLIST_MODIFY,
//    NOTE_ACTION,
//    USE_MECH_DOOR,
//    CHANGE_KEYMAP,
//    RPS_GAME,
//    RING_ACTION,
//    ALLIANCE_OPERATION,
//    DENY_ALLIANCE_REQUEST,
//    REQUEST_FAMILY,
//    OPEN_FAMILY,
//    FAMILY_OPERATION,
//    DELETE_JUNIOR,
//    DELETE_SENIOR,
//    ACCEPT_FAMILY,
//    USE_FAMILY,
//    FAMILY_PRECEPT,
//    FAMILY_SUMMON,
//    CYGNUS_SUMMON,
//    ARAN_COMBO,
//    LOST_ARAN_COMBO,
//    CRAFT_DONE,
//    CRAFT_EFFECT,
//    CRAFT_MAKE,
//    BBS_OPERATION,
//    CHANGE_MARKET_MAP,
//    CHANGE_PLAYER,
//    MEMORY_SKILL_CHOOSE,
//    MEMORY_SKILL_CHANGE,
//    MEMORY_SKILL_OBTAIN,
//    GAME_POLL,
//    BUY_CROSS_ITEM,
//    USE_JIANRENZHIBI,
//    DISTRIBUTE_HYPER_SP,
//    RESET_HYPER_SP,
//    PET_CHAT,
//    PET_COMMAND,
//    PET_AUTO_POT,
//    PET_EXCEPTION_LIST,
//    PET_AOTO_EAT,
//    MOVE_DRAGON,
//    DRAGON_FLY,
//    MOVE_ANDROID,
//    QUICK_SLOT,
//    PLAYER_VIEW_RANGE,
//    OPEN_ROOT_NPC,
//    SYSTEM_PROCESS_LIST,
//    SHOW_LOVE_RANK,
//    TRANSFORM_PLAYER,
//    OPEN_AVATAR_RANDOM_BOX,
//    ENTER_MTS,
//    USE_TREASUER_CHEST,
//    MACROSS_TICKET,
//    PAM_SONG,
//    SET_CHAR_CASH,
//    AUTO_AGGRO,
//    FRIENDLY_DAMAGE,
//    MONSTER_BOMB,
//    HYPNOTIZE_DMG,
//    MOB_BOMB,
//    MOB_NODE,
//    DISPLAY_NODE,
//    DAMAGE_REACTOR,
//    TOUCH_REACTOR,
//    MAKE_EXTRACTOR,
//    SNOWBALL,
//    LEFT_KNOCK_BACK,
//    COCONUT,
//    MONSTER_CARNIVAL,
//    SHIP_OBJECT,
//    PLAYER_UPDATE,
//    PARTY_MEMBER_SEARCH,
//    PARTY_SEARCH,
//    START_HARVEST,
//    STOP_HARVEST,
//    QUICK_MOVE_SPECIAL,
//    QUICK_MOVE,
//    SEND_CS_GIFI,
//    SEND_CS_HOT,
//    MAPLETV,
//    UPDATE_QUEST,
//    QUEST_ITEM,
//    USE_ITEM_QUEST,
//    TOUCHING_MTS,
//    MTS_TAB,
//    CHANGE_SET,
//    GET_BOOK_INFO,
//    CLICK_REACTOR,
//    USE_FAMILIAR,
//    SPAWN_FAMILIAR,
//    RENAME_FAMILIAR,
//    MOVE_FAMILIAR,
//    TOUCH_FAMILIAR,
//    ATTACK_FAMILIAR,
//    SIDEKICK_OPERATION,
//    DENY_SIDEKICK_REQUEST,
//    PVP_INFO,
//    ENTER_PVP,
//    ENTER_PVP_PARTY,
//    LEAVE_PVP,
//    PVP_RESPAWN,
//    PVP_ATTACK,
//    PVP_SUMMON,
//    USE_HAMMER,
//    HAMMER_RESPONSE,
//    GUIDE_TRANSFER,//游戏向导
//    EXIT_GAME,
//    BOSS_PARTY_SEARCH_REQUEST,
//    BOSS_PARTY_SEARCH,
//    USE_CUBE,
//    ARROWS_TURRET_ATTACK, //箭矢炮盘 射箭的包
//    SPAWN_ARROWS_TURRET, //召唤 箭矢炮盘
//    REST_INTERNAL_ABILITY,
//    RETURN_CRAFT,
//    POINT_POWER,
//    VOID_PRESSURE,//虚空重压
//    SUPER_SPECTRA,//光法师超级光谱
//    GETMONOID,
//    UPDATE_MAC_SKILL,
//    MIST_ATTACK,
//    OPEN_MAP,
//    FlLAMES_TRACK,
//    SPECIAL_MAGIC_ATTACK,
//    RUNE_OPERATION,
//    RUNE_RESPONSE,
//    ES_OPERATION,
//    FREE_TRANFSER,;

    private byte code = -2;
    private final boolean CheckState;
    private int handlerType;

    @Override
    public void setValue(byte code) {
        this.code = code;
    }

    @Override
    public byte getValue() {
        return code;
    }

    RecvPacketOpcode(int code) {
        this.code = (byte)code;
        this.CheckState = true;
    }

    RecvPacketOpcode(int code, boolean checkState) {
        this.code = (byte)code;
        this.CheckState = checkState;
    }

    public boolean NeedsChecking() {
        return CheckState;
    }

    public static boolean isTempHeader(RecvPacketOpcode header) {
        switch (header) {
//            case MOVE_LIFE:
//            case MOVE_PLAYER:
//                return false;
        }
        return true;
    }

    public static boolean isSpamHeader(RecvPacketOpcode header) {
//        switch (header) {
////            case PONG:
////            case MOVE_LIFE:
////            case NPC_ACTION:
//                return true;
//        }
        return false;
    }
}
