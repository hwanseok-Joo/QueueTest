package QueueTest;
/**
 * Copyright 2016 DAOU TECH Inc. All right reserved.
 **/
public class SendMsgVO extends AlioVO {

    private static final long serialVersionUID = -4030704046566700227L;

    String VERSION;
    String DEVICE;
    String MSGID;
    String SENDRC;
    String SENDRC_MSG;
    byte[] SKNFILE_DATA = null;

    boolean TRYMORE = true;
    private String C_MSG_BODY;
    private String C_ATTACHED_FILE;
    private String C_RE_BODY;
    private String C_SEND_TIME;
    private String C_SUBJECT;
    private long ATTACHED_FILE_SIZE;
    private int ATTACEHD_COUNT;
    private String MMS_CONTENTS_TYPE;

    private int USER_NO; // biz web 추가 항목
    private String USER_ID; // biz web 추가 항목
    private String USER_NAME; // biz web 추가 항목
    private String USER_HOME; // biz web 추가 항목
    private String AD_FLAG; // biz web 추가 항목
    private String USER_KEY; //biz web 추가 항목

    public String getUSER_KEY() {
        return USER_KEY;
    }
    public void setUSER_KEY(String uSER_KEY) {
        USER_KEY = uSER_KEY;
    }
    public String getAD_FLAG() {
        return AD_FLAG;
    }
    public void setAD_FLAG(String aD_FLAG) {
        AD_FLAG = aD_FLAG;
    }
    public String getUSER_NAME() {
        return USER_NAME;
    }
    public void setUSER_NAME(String uSER_NAME) {
        USER_NAME = uSER_NAME;
    }
    public String getUSER_HOME() {
        return USER_HOME;
    }
    public void setUSER_HOME(String uSER_HOME) {
        USER_HOME = uSER_HOME;
    }
    public int getUSER_NO() {
        return USER_NO;
    }
    public void setUSER_NO(int uSER_NO) {
        USER_NO = uSER_NO;
    }
    public String getUSER_ID() {
        return USER_ID;
    }
    public void setUSER_ID(String uSER_ID) {
        USER_ID = uSER_ID;
    }
    public byte[] getSKNFILE_DATA() {
        return SKNFILE_DATA;
    }
    public void setSKNFILE_DATA(byte[] sknFileData) {
        this.SKNFILE_DATA = sknFileData;
    }
    public String getSENDRC_MSG() {
        return SENDRC_MSG;
    }
    public void setSENDRC_MSG(String sENDRC_MSG) {
        SENDRC_MSG = sENDRC_MSG;
    }
    public String getMMS_CONTENTS_TYPE() {
        if (MMS_CONTENTS_TYPE == null) return "";
        return MMS_CONTENTS_TYPE;
    }
    public void setMMS_CONTENTS_TYPE(String mMS_CONTENTS_TYPE) {
        MMS_CONTENTS_TYPE = mMS_CONTENTS_TYPE;
    }
    public int getATTACEHD_COUNT() {
        return ATTACEHD_COUNT;
    }
    public void setATTACEHD_COUNT(int aTTACEHD_COUNT) {
        ATTACEHD_COUNT = aTTACEHD_COUNT;
    }
    public long getATTACHED_FILE_SIZE() {
        return ATTACHED_FILE_SIZE;
    }
    public void setATTACHED_FILE_SIZE(long aTTACHED_FILE_SIZE) {
        ATTACHED_FILE_SIZE = aTTACHED_FILE_SIZE;
    }
    public String getC_SUBJECT() {
        return C_SUBJECT;
    }
    public void setC_SUBJECT(String c_SUBJECT) {
        C_SUBJECT = c_SUBJECT;
    }
    public String getC_SEND_TIME() {
        return C_SEND_TIME;
    }
    public void setC_SEND_TIME(String c_SEND_TIME) {
        C_SEND_TIME = c_SEND_TIME;
    }
    public String getC_RE_BODY() {
        return C_RE_BODY;
    }
    public void setC_RE_BODY(String c_RE_BODY) {
        C_RE_BODY = c_RE_BODY;
    }
    public String getC_ATTACHED_FILE() {
        return C_ATTACHED_FILE;
    }
    public void setC_ATTACHED_FILE(String c_ATTACHED_FILE) {
        C_ATTACHED_FILE = c_ATTACHED_FILE;
    }
    public String getC_MSG_BODY() {
        return C_MSG_BODY;
    }
    public void setC_MSG_BODY(String cONVERT_MSG_BODY) {
        C_MSG_BODY = cONVERT_MSG_BODY;
    }
    public String getSENDRC() {
        return SENDRC;
    }
    public void setSENDRC(String sENDRESULTCODE) {
        SENDRC = sENDRESULTCODE;
    }
    public String getMSGID() {
        return MSGID;
    }
    public void setMSGID(String mSGID) {
        MSGID = mSGID;
    }
    public String getVERSION() {
        return (VERSION != null) ? VERSION : "";
    }
    public void setVERSION(String version) {
        VERSION = version;
    }
    public String getDEVICE() {
        return (DEVICE != null) ? DEVICE : "";
    }
    public void setDEVICE(String device) {
        DEVICE = device;
    }
    public boolean isTRYMORE() {
        return TRYMORE;
    }
    public void setTRYMORE(boolean trymore) {
        TRYMORE = trymore;
    }
    @Override
    public String toString() {
        return "[MSG_TYPE=" + getMSG_TYPE()
                + (getCMID() != null ? ", CMID=" + getCMID() : "")
                + (getUMID() != null ? ", UMID=" + getUMID() : "")
                + (USER_ID != null ? ", USERID=" + USER_ID : "")
                + USER_NO
                + (getUMID() != null ? ", UMID=" + getUMID() : "")
                + (SENDRC != null ? ", SEND_RESULT=" + SENDRC : "")
                + (C_MSG_BODY != null ? ", C_MSG_BODY=" + C_MSG_BODY : "")
                + (C_SEND_TIME != null ? ", C_SEND_TIME=" + C_SEND_TIME : "")
                + (getDEST_PHONE() != null ? ", DEST_PHONE=" + getDEST_PHONE() : "")
                + (getSEND_PHONE() != null ? ", SEND_PHONE=" + getSEND_PHONE() : "")
                + (getSENDER_KEY() != null ? ", SENDER_KEY=" + getSENDER_KEY() : "")
                + (getTEMPLATE_CODE() != null ? ", TEMPLATE_CODE=" + getTEMPLATE_CODE() : "")
                + (getATTACHMENT() != null ? ", ATTACHMENT="  + getATTACHMENT() : "")
                + (getRE_TYPE() != null ? ", RE_TYPE=" + getRE_TYPE() : "")
                + (C_RE_BODY != null ? ", C_RE_BODY=" + C_RE_BODY : "")
                + (getRE_PART() != null ? ", RE_PART=" + getRE_PART() : "") +"]" ;
    }

    public String toString_Summary() {
        return "[MSG_TYPE=" + getMSG_TYPE()
                + (getCMID() != null ? ", CMID=" + getCMID() : "")
                + (getUMID() != null ? ", UMID=" + getUMID() : "")
                + (SENDRC != null ? ", SEND_RESULT=" + SENDRC : "")
                + (SENDRC_MSG != null ? ", SEND_RESULT_MSG=" + SENDRC_MSG : "")+ "]";
    }
}