package ana.abstraction;

import java.util.*;

//Lets hide complex banking operations(like loan approvals) behind simple abstract methpds, so
//just user calls them without knowing how they work
public abstract class Bank {
    abstract void deposit();
    abstract void withdraw();
    public final String COUNTRY_NAME="India";

    public String CHANGING_COUNTRY="Mexico";

    public void openAccount()
    {
        Map<String,Integer> hm=new HashMap<>();
        hm.put("kajal",1);
        // Map
        System.out.println("Account opened successfully!");
    }

    public Bank()
    {
        System.out.println("Default");
    }

    public static void display()
    {
        System.out.println("HIIIII");
    }
}
