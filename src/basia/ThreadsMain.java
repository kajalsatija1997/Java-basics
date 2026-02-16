package basia;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadsMain {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer,String> map=new HashMap<>();
        //T1 : writing data
        Thread t1= new Thread(()->
        {
           for(int i=1;i<=5;i++)
           {
               map.put(i,"Value-"+i);
               System.out.println("Writer 1 put "+i);
           }
        });

        //T2 : writing data
        Thread t2= new Thread(()->
        {
            for(int i=1;i<=5;i++)
            {
                map.put(i,"Value-"+i);
                System.out.println("Writer 2 put "+i);
            }
        });

        //T3 : Reading data
        Thread reader= new Thread(()->
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Reader got :" +i+"-->"+map.get(i));
            }
        });

        //T4 : Atomic operation
        Thread atomicThread= new Thread(()->
        {
           map.putIfAbsent(5,"NEW-VALUE");
           map.computeIfAbsent(11,k-> "Value-11");
        });

        //Strat threads
        t1.start();
        t2.start();
        reader.start();
        atomicThread.start();

        //Wait for all threads
        t1.join();
        t2.join();
        reader.join();
        atomicThread.join();

        System.out.println("Final map contnet");
        map.forEach((k,v)-> System.out.println(k+" = "+v));
    }
}
