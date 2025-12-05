package Swetha.Threads;

import java.time.LocalDateTime;

public class Demo {

    final Object lock=new Object();
    boolean taskDone=false;

    public static void main(String[] args) {
        Demo d=new Demo();

        new Thread(d::sleepExample,"SLEEP-THREAD").start();
        new Thread(d::yieldExample,"YIELD-THREAD").start();
        new Thread(d::waiterOne,"WAITER-1").start();
        new Thread(d::waiterTwo,"WAITER-2").start();
        new Thread(d::notifier,"NOTIFIER").start();
    }

    void sleepExample()
    {
        System.out.println(Thread.currentThread().getName()+": starting work....");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
           ex.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+": I woke up after sleep");
    }

    void yieldExample()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+":working...."+i);
            Thread.yield(); //give chance to other threads
        }
    }

    void waiterOne()
    {
      synchronized (lock)
        {
            try {
                System.out.println(Thread.currentThread().getName()+": Waiting... "+ LocalDateTime.now());
                lock.wait(); //wait until notified
                System.out.println(Thread.currentThread().getName()+": Got notify (or notifyAll)" );
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    void waiterTwo()
    {

        synchronized (lock)
        {
            try {
                System.out.println(Thread.currentThread().getName()+": Waiting..."+ LocalDateTime.now());
                lock.wait(); //wait until notified
                System.out.println(Thread.currentThread().getName()+": Got notify (or notifyAll)" );
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    void notifier()
    {
        try{
            Thread.sleep(3000); //wait before notifying
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }

        synchronized (lock)
        {
            System.out.println(Thread.currentThread().getName()+": Sending notifyAll...");
            lock.notify(); //wakes both waiter one and waiter 2
        }
    }
}
