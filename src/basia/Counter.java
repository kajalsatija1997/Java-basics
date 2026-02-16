package basia;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int count=0;
    //Monitor lock
    private final Object lock=new Object();
    //Fairness policy- FCFS
   ReentrantLock lock1=new ReentrantLock(true);
    //Only one thread can execute increment() at a time
    //No lost update
    //Output always 2000
    void increment()
    {
        //Read count
        //Add 1
        //Write back
        //One increment is lost if T1 reads 5 T2 reads 5 T1 reads 6 T2 raeds 6
        synchronized (lock) {
            count++; // Critical section
        }
    }

/*    static synchronized void increment1()
    {
        count++;
    }*/


    //Object lock-> Room key
    // Static block-> Building key

    void increment2()
    {
        lock1.lock();
        try{
            count++;
        }
        finally {
            lock1.unlock();
        }

    }

    //Thread will not wait forever
    void increment3()
    {
        if(lock1.tryLock()){
            try{
                count++;
            }
            finally {
                lock1.unlock();
            }
        }
    }


}
