package QueueTest;

/*
 * Copyright 2016 DAOU TECH Inc. All right reserved.
 */

import java.io.Serializable;

public class AlioVO implements Serializable {

    private static final long serialVersionUID = -4411061541588966118L;

    private String CMID;				// 데이터 id, 고유한 값 Primary Key
    private String UMID;				// 다우기술 서버에서 정의한 message id
    private int MSG_TYPE;				// 데이터 타입 (SMS 0 / WAP 1 / FAX 2 / PHONE 3 / SMS_INBOUND 4 / MMS 5 / 알림톡 6 / 친구톡 7)
    private int STATUS;				// 데이터 발송 상태 (대기 0 / 발송 중 1 / 발송 완료 2 / 에러 3)
    private String REQUEST_TIME="";		// 데이터 등록 시간
    private String SEND_TIME="";			// 발송 기준 시간
    private String REPORT_TIME="";			// 단말기 수신 시간
    private String DEST_PHONE="";			// 수신번호
    private String DEST_NAME="";			// 수신자명
    private String SEND_PHONE="";			// 발신자번호
    private String SEND_NAME="";			// 발신자명
    private String SUBJECT="";				// 제목
    private String MSG_BODY="";			// 메시지 내용
    private String NATION_CODE="";			// 국가코드
    private String SENDER_KEY="";			// 발신프로필키
    private String TEMPLATE_CODE="";		// 템플릿 코드
    private String RESPONSE_METHOD="";		// 카카오톡 비즈메시지 발송 방식(Realtime/Push/Polling)
    private int TIMEOUT = 0;				// 대체발송을 위한 타임아웃 시간설정
    private String MSG_GRP_CODE="";		// 메시지 유형구분
    private String RE_TYPE="";			// 대체발송 메시지 타입 (SMS/LMS/MMS)
    private String RE_BODY="";			// 대체발송 메시지 내용
    private String RE_PART="";			// 대체발송 처리 주체 (클라이언트, G/W)
    private String WAP_URL="";				// URL 주소
    private int COVER_FLAG = 0;			// 표지 발송 옵션
    private int SMS_FLAG = 0;			// 실패 시 문자 전송 옵션
    private int REPLY_FLAG = 0;			// 시나리오 답변기능 여부
    private int RETRY_CNT = 0;				// 재시도회수
    private String ATTACHED_FILE="";		// 첨부파일 전송시 파일명(여러 개일 경우, '|' 문자로 구분
    private String VXML_FILE="";			// 음성 시나리오 파일 이름
    private String CALL_STATUS="";			// 발송결과 리포트
    private int USE_PAGE;				// 발송 페이지 수
    private int USE_TIME;				// 발송 소요 시간 (단위 : 초)
    private int SN_RESULT;				// 설문 조사 응답 값 (0~9)
    private String TEL_INFO="";			// 통신사 정보 (SKT/KTF/LGT)
    private String CINFO="";				// Client Indexed Info ( 특수기호 \/:*?"<>|. 를 사용할 수 없음 )
    private String SKN_FILE_NAME="";		// G/W에서 MMS/LMS 발송시 사용하는 파일
    private String BUILD_YN="";			// MMS/LMS 발송을 위한 SKN FILE을 생성 여부
    private String ATTACHMENT="";		// 알림톡 첨부파일(JSON)

    public String getATTACHMENT() {
        return ATTACHMENT;
    }
    public void setATTACHMENT(String aTTACHMENT) {
        ATTACHMENT = aTTACHMENT;
    }
    public String getCMID() {
        return CMID;
    }
    public void setCMID(String cMID) {
        CMID = cMID;
    }
    public String getUMID() {
        return UMID;
    }
    public void setUMID(String uMID) {
        UMID = uMID;
    }
    public int getMSG_TYPE() {
        return MSG_TYPE;
    }
    public void setMSG_TYPE(int mSG_TYPE) {
        MSG_TYPE = mSG_TYPE;
    }
    public int getSTATUS() {
        return STATUS;
    }
    public void setSTATUS(int sTATUS) {
        STATUS = sTATUS;
    }
    public String getREQUEST_TIME() {
        return REQUEST_TIME;
    }
    public void setREQUEST_TIME(String rEQUEST_TIME) {
        REQUEST_TIME = rEQUEST_TIME;
    }
    public String getSEND_TIME() {
        return SEND_TIME;
    }
    public void setSEND_TIME(String sEND_TIME) {
        SEND_TIME = sEND_TIME;
    }
    public String getREPORT_TIME() {
        return REPORT_TIME;
    }
    public void setREPORT_TIME(String rEPORT_TIME) {
        REPORT_TIME = rEPORT_TIME;
    }
    public String getDEST_PHONE() {
        return DEST_PHONE;
    }
    public void setDEST_PHONE(String dEST_PHONE) {
        DEST_PHONE = dEST_PHONE;
    }
    public String getDEST_NAME() {
        return DEST_NAME;
    }
    public void setDEST_NAME(String dEST_NAME) {
        DEST_NAME = dEST_NAME;
    }
    public String getSEND_PHONE() {
        return SEND_PHONE;
    }
    public void setSEND_PHONE(String sEND_PHONE) {
        SEND_PHONE = sEND_PHONE;
    }
    public String getSEND_NAME() {
        return SEND_NAME;
    }
    public void setSEND_NAME(String sEND_NAME) {
        SEND_NAME = sEND_NAME;
    }
    public String getSUBJECT() {
        return SUBJECT;
    }
    public void setSUBJECT(String sUBJECT) {
        SUBJECT = sUBJECT;
    }
    public String getMSG_BODY() {
        return MSG_BODY;
    }
    public void setMSG_BODY(String mSG_BODY) {
        MSG_BODY = mSG_BODY;
    }
    public String getNATION_CODE() {
        return NATION_CODE;
    }
    public void setNATION_CODE(String nATION_CODE) {
        NATION_CODE = nATION_CODE;
    }
    public String getSENDER_KEY() {
        return SENDER_KEY;
    }
    public void setSENDER_KEY(String sENDER_KEY) {
        SENDER_KEY = sENDER_KEY;
    }
    public String getTEMPLATE_CODE() {
        return TEMPLATE_CODE;
    }
    public void setTEMPLATE_CODE(String tEMPLATE_CODE) {
        TEMPLATE_CODE = tEMPLATE_CODE;
    }
    public String getRESPONSE_METHOD() {
        return RESPONSE_METHOD;
    }
    public void setRESPONSE_METHOD(String rESPONSE_METHOD) {
        RESPONSE_METHOD = rESPONSE_METHOD;
    }
    public int getTIMEOUT() {
        return TIMEOUT;
    }
    public void setTIMEOUT(int tIMEOUT) {
        TIMEOUT = tIMEOUT;
    }
    public String getMSG_GRP_CODE() {
        return MSG_GRP_CODE;
    }
    public void setMSG_GRP_CODE(String mSG_GRP_CODE) {
        MSG_GRP_CODE = mSG_GRP_CODE;
    }
    public String getRE_TYPE() {
        return RE_TYPE;
    }
    public void setRE_TYPE(String rE_TYPE) {
        if(rE_TYPE == null || rE_TYPE.equals("")) RE_TYPE = "NONE";
        else RE_TYPE = rE_TYPE;
    }
    public String getRE_BODY() {
        return RE_BODY;
    }
    public void setRE_BODY(String rE_BODY) {
        RE_BODY = rE_BODY;
    }
    public String getRE_PART() {
        return RE_PART;
    }
    public void setRE_PART(String rE_PART) {
        RE_PART = rE_PART;
    }
    public String getWAP_URL() {
        return WAP_URL;
    }
    public void setWAP_URL(String wAP_URL) {
        WAP_URL = wAP_URL;
    }
    public int getCOVER_FLAG() {
        return COVER_FLAG;
    }
    public void setCOVER_FLAG(int cOVER_FLAG) {
        COVER_FLAG = cOVER_FLAG;
    }
    public int getSMS_FLAG() {
        return SMS_FLAG;
    }
    public void setSMS_FLAG(int sMS_FLAG) {
        SMS_FLAG = sMS_FLAG;
    }
    public int getREPLY_FLAG() {
        return REPLY_FLAG;
    }
    public void setREPLY_FLAG(int rEPLY_FLAG) {
        REPLY_FLAG = rEPLY_FLAG;
    }
    public int getRETRY_CNT() {
        return RETRY_CNT;
    }
    public void setRETRY_CNT(int rETRY_CNT) {
        RETRY_CNT = rETRY_CNT;
    }
    public String getATTACHED_FILE() {
        return ATTACHED_FILE;
    }
    public void setATTACHED_FILE(String aTTACHED_FILE) {
        ATTACHED_FILE = aTTACHED_FILE;
    }
    public String getVXML_FILE() {
        return VXML_FILE;
    }
    public void setVXML_FILE(String vXML_FILE) {
        VXML_FILE = vXML_FILE;
    }
    public String getCALL_STATUS() {
        return CALL_STATUS;
    }
    public void setCALL_STATUS(String cALL_STATUS) {
        CALL_STATUS = cALL_STATUS;
    }
    public int getUSE_PAGE() {
        return USE_PAGE;
    }
    public void setUSE_PAGE(int uSE_PAGE) {
        USE_PAGE = uSE_PAGE;
    }
    public int getUSE_TIME() {
        return USE_TIME;
    }
    public void setUSE_TIME(int uSE_TIME) {
        USE_TIME = uSE_TIME;
    }
    public int getSN_RESULT() {
        return SN_RESULT;
    }
    public void setSN_RESULT(int sN_RESULT) {
        SN_RESULT = sN_RESULT;
    }
    public String getTEL_INFO() {
        return TEL_INFO;
    }
    public void setTEL_INFO(String tEL_INFO) {
        TEL_INFO = tEL_INFO;
    }
    public String getCINFO() {
        return CINFO;
    }
    public void setCINFO(String cINFO) {
        CINFO = cINFO;
    }
    public String getSKN_FILE_NAME() {
        return SKN_FILE_NAME;
    }
    public void setSKN_FILE_NAME(String sKN_FILE_NAME) {
        SKN_FILE_NAME = sKN_FILE_NAME;
    }
    public String getBUILD_YN() {
        return BUILD_YN;
    }
    public void setBUILD_YN(String bUILD_YN) {
        BUILD_YN = bUILD_YN;
    }

}
