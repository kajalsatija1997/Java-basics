package Swetha.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //Dynamic array
        //Generics
        List<Double> marks=new ArrayList<>();
        marks.add(120.8);
        marks.add(345.9);
        marks.add(56.0);

        List<Double> marks2=new ArrayList<>();
        marks2.add(27.2);
        marks2.add(67.2);

        marks.addAll(marks2);

        for(Double mark: marks)
        {
            System.out.println(mark);
        }
    }
}
