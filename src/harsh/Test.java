package harsh;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        //Better because java doesnt support multiple inheritence
        Thread t=new Thread(new MyThread());
        t.start();

        MyInterface i=(a)-> System.out.println("Hi"+a);


        //Before java 8-> manual filtering

        //Predicate+streams-> cleaner

        Predicate<Integer> isEven= n-> n%2==0;
        System.out.println(isEven.test(1));

        BiPredicate<Integer,String> isEvenAndEqualityCheck= (num,name)-> num%2==0 && name.equals("abc");
        System.out.println(isEvenAndEqualityCheck.test(10,"abc"));
    }
}
