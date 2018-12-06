package QueueTest;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainWorker {

    public static void main(String[] args){
        //BlockingQueue<SendMsgVO> queue = new LinkedBlockingQueue<>();
    //    ConcurrentLinkedQueue<SendMsgVO> queue = new ConcurrentLinkedQueue<>();
  //      ConcurrentLinkedQueueProducer producer = new ConcurrentLinkedQueueProducer(queue);
  //      ConcurrentLinkedQueueConsumer consumer = new ConcurrentLinkedQueueConsumer(queue);

        Queue<SendMsgVO> queue = new Queue<SendMsgVO>() {
            @Override
            public boolean add(SendMsgVO sendMsgVO) {
                return false;
            }

            @Override
            public boolean offer(SendMsgVO sendMsgVO) {
                return false;
            }

            @Override
            public SendMsgVO remove() {
                return null;
            }

            @Override
            public SendMsgVO poll() {
                return null;
            }

            @Override
            public SendMsgVO element() {
                return null;
            }

            @Override
            public SendMsgVO peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<SendMsgVO> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends SendMsgVO> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
//
        QueueProducer producer = new QueueProducer(queue);
        QueueConsumer consumer = new QueueConsumer(queue);


        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}

