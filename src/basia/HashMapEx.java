package basia;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> rollNoNameHashmap=new HashMap<>(); // Runtime polymorphism
        rollNoNameHashmap.put(1,"Kajal");
        rollNoNameHashmap.put(2,"Basia");

        System.out.println(rollNoNameHashmap.get(1));

        for(Map.Entry<Integer,String> entry:rollNoNameHashmap.entrySet())
        {
            System.out.println("Key: "+entry.getKey()+ "Value: "+entry.getValue());
        }

        for(String name: rollNoNameHashmap.values())
        {
            System.out.println(name);
        }
    }
}
