package Swetha.newSession.test;

import Swetha.Assignments.Test;

public class IncrementDecrementTest {
    public static void main(String[] args) {
        int a=5;
        boolean b= a++ == ++a;

       // int c= (a++ > 5) ? (++b) : (b++);

        System.out.println(a);
        System.out.println(b);
        //System.out.println(c);

        //POST INCREMENT- Use before and then increment
        //PRE INCREMENT- Increase and then use later
       // int b= --a + a-- + --a;

       // a+=a++ + ++a;

        //System.out.println(a);
        //System.out.println(b);




    }

    static void random()
    {
        int x=10; //Stack
        Test t=new Test(); // reference t will go in stack
    }
}
