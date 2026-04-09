package kairav;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double> ();
        double temp = 3.14159;
        for (int k = 1; k <= 10; k++){
            list.add (new Double (temp)) ;
        temp = mystery (temp);
        }
        System. out. println (list);
        int n1=Integer.MAX_VALUE;

    }

    public static double mystery (double x) {
        x = x + Math.PI;
        x = Math.sqrt(x);
        x = x - (int) x;
        return x;
    }
}
