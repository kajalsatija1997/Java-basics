package jacek;

import java.util.ArrayList;
import java.util.List;

public class GCExample {
    static List<Person> longLiving= new ArrayList<>();
    static List<Person> leak= new ArrayList<>();

    public static void main(String[] args) {
      //Object A
      Person a=new Person("A"); // Eden

        //Object B
        Person b=new Person("B"); // Eden

        //Object C (temp)
        new Person("C"); //Eden

        //Make B long living
        longLiving.add(b);

        //Force GC by creating many objects
        for(int i=0;i<100000;i++)
        {
            new Person("Temp "+i); //Eden
        }

        //Object D
        Person d=new Person("D"); // Eden

        //Object E
        Person e=new Person("E"); // Eden

        //Objects always referenced
        //Never removed
        //Old gen fills
        //OutOfMemoryError
        while(true)
        {
            leak.add(new Person("Leak")); // Chances of OutOfMemoryError
        }


    }
}
