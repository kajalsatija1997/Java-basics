package basia.threading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<Integer> queue=new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity){
            wait(); //wait if buffer is full
        }
        queue.add(value);
        System.out.println("Produced: "+value);

        notify(); // notify consumer
    }

    public synchronized void consumer() throws InterruptedException {
        while (queue.isEmpty()){
            wait(); //wait if buffer is empty
        }
        int value=queue.poll();
        System.out.println("Consumed: "+value);

        notify(); // notify producer
    }
}
