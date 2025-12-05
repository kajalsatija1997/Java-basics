package Swetha.Threads;

public class CreationOfThreads {
    public static void main(String[] args) {
        //STEP 3- TO MAKE THIS THREAD RUNNING
        //First way of creating threads
        MyThread t=new MyThread(); //A new thread is created
        t.start(); //Starts a new thread


        //Second way of creating threads
        Thread task=new Thread(new MyTask());
        task.start();
    }
}
