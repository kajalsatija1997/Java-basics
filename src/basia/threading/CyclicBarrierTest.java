package basia.threading;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier barrier=new CyclicBarrier(3);

        new Thread(new Worker(barrier)).start();
        new Thread(new Worker(barrier)).start();
        new Thread(new Worker(barrier)).start();
    }
}

