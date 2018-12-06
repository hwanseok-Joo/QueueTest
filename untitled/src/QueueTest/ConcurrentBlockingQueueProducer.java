package QueueTest;

import java.util.concurrent.BlockingQueue;

public class ConcurrentBlockingQueueProducer implements Runnable{
    private static final int FETCHCOUNT=5000;
    private BlockingQueue<SendMsgVO> queue;

    public ConcurrentBlockingQueueProducer(BlockingQueue<SendMsgVO> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
            try {

                for(int i=0;i<FETCHCOUNT;i++) {
                    queue.put(convert(i));
                }
                System.out.println("inputFinish" );
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("thread is dead!");
            Thread.currentThread().interrupt();
        }

    private SendMsgVO convert(int number) throws Exception{

        SendMsgVO smv = new SendMsgVO();
        // CMSG키는 캠페인키_메시지키_파티션키의 조합이다. ( 메시지테이블의 PK조합 )
        //smv.setCMID(campainDto.getUserId()+"_"+campainDto.getCmId());
        smv.setCMID("testtest " + number );
        smv.setSUBJECT("subject" + number );
        smv.setUSER_ID("user_id " + number );
        smv.setUSER_NO(number);
        smv.setUSER_NAME("username " + number);
        smv.setUSER_HOME("home/detail/"+number);
        smv.setAD_FLAG("Y");
        smv.setUSER_KEY("NuMbER+"+number);
        smv.setSEND_PHONE("01032691599");

        //log.debug("dtailDto.getMsgId() ===="+dtailDto.getMsgId());
        smv.setTIMEOUT(0);
        smv.setRESPONSE_METHOD("push"); // push가 디폴트

        return smv;
    }


}
