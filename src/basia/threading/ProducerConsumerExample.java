package basia.threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);

        Runnable producer=()->
        {
        int value=0;
        try {
            while (true) {
                queue.put(value);
                System.out.println("Produced: " + value++);
                Thread.sleep(500);
            }
        }catch(Exception e)
            {
                e.printStackTrace();
            }
        };

        Runnable consumer=()->
        {
            try {
                while (true) {
                    int value=queue.take();
                    System.out.println("Produced: " + value);
                    Thread.sleep(1000);
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
