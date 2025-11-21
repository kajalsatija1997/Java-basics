package Swetha.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimpleCollection {
    public static void main(String[] args) {
        /*int a; //declaration
        a=6; //initialization

        int a1=6; //both declaration & initialization inn one statement*/
        Collection<String> c; //DECLARATION
        c = new ArrayList(); //INITIALIZATION
        System.out.println(c.getClass().getName());
        for (int i=1; i <= 10; i++) {
            c.add(i + " * " + i + " = "+i*i);
        }
        //1st way of iterating(BASIC)
        for(String str: c)
        {
            System.out.println(str);
        }


        //2nd way
        Iterator iter = c.iterator();
        while (iter.hasNext()) // whether collection has any element- if yes- go inside the loop
            System.out.println(iter.next()); //print next element available
    }

}
