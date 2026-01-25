package Swetha.newSession.test.interviews;

public class Test {
    static boolean flag=false;
    public static void main(String[] args) {

        new Thread(()->
        {
            int a=10;
         while(!flag)
         {
             System.out.println("STOPPED");
         }
        }).start();

        new Thread(()->
        {
            int a=10;
           flag=true;
        }).start();

    }
}
