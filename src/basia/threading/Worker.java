package basia.threading;

import java.util.concurrent.CyclicBarrier;

public class Worker implements Runnable {

    private CyclicBarrier barrier;

    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+ " working..");

            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName()+" waiting at barrier");

            barrier.await();

            System.out.println(Thread.currentThread().getName() + " crossed barrier");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
