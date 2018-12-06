package QueueTest;

//소비자는 큐에서 가져가서 socket에 쏘기!?
// 그럼 일단 가져와서 뿌려주는 것만 해보자...

import java.util.concurrent.BlockingQueue;

public class ConcurrentBlockingQueueConsumer implements Runnable {
    private BlockingQueue<SendMsgVO> queue;

    public ConcurrentBlockingQueueConsumer(BlockingQueue<SendMsgVO> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
            while(!Thread.currentThread().isInterrupted()) {
                SendMsgVO smv = null;
                try {
                    smv = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("getID : " + smv.getCMID() + "|thread :" + Thread.currentThread().getId());
            }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
