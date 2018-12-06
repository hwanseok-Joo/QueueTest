package QueueTest;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueConsumer implements Runnable{
    //private BlockingQueue<SendMsgVO> queue;
   // private ConcurrentLinkedQueue<SendMsgVO> queue;
    private Queue<SendMsgVO> queue;

    /*
    public ConcurrentBlockingQueueConsumer(BlockingQueue<SendMsgVO> queue){
        this.queue = queue;
    }*/
    /*public ConcurrentLinkedQueueConsumer(ConcurrentLinkedQueue<SendMsgVO> queue){
        this.queue = queue;
    }*/
    public QueueConsumer(Queue<SendMsgVO> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        while(!Thread.currentThread().isInterrupted()) {
            SendMsgVO smv = null;
            //if(!queue.isEmpty()) {
            smv = queue.poll();
            System.out.println("getID : " + smv.getCMID() + "|thread :" + Thread.currentThread().getId());
            //}
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
