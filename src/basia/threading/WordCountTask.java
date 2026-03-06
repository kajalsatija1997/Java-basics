package basia.threading;

import java.util.concurrent.RecursiveTask;

public class WordCountTask extends RecursiveTask<Integer> {

    private String text;
    private int start;
    private int end;

    //text- Hi I am kajal
    //Task 1-> start=0 -> end =500
    //Task2-> start=500 end =1000

    private static final int THRESHOLD=100;

    public WordCountTask(String text, int start, int end) {
        this.text = text;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if(end-start <=THRESHOLD)
        {
         return countWords();
        }
        int mid=(start+end)/2;

        WordCountTask leftTask= new WordCountTask(text,start,mid);
        WordCountTask rightTask= new WordCountTask(text,mid,end);

        leftTask.fork(); //execute async
        int rightResult=rightTask.compute();
        int leftResult=leftTask.join();

        return leftResult+rightResult;
    }

    private int countWords()
    {
        int count=0;

        for(int i=start;i<end;i++)
        {
            if(Character.isWhitespace(text.charAt(i)))
            {
                count++;
            }
        }
        return count+1;
    }
}
