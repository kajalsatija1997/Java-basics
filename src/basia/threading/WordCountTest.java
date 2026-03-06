package basia.threading;

import java.util.concurrent.ForkJoinPool;

public class WordCountTest {
    public static void main(String[] args) {
        String text= "Java concurrency fork join framework example text for counting words";
        ForkJoinPool pool= new ForkJoinPool();
        WordCountTask task=new WordCountTask(text,0,text.length());

        int result=pool.invoke(task);
        System.out.println("Word count: "+result);
    }
}
