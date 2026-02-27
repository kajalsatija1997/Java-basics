package harsh;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        //Insertion order- LinkedHashSet
        //Sorted order-> Treeset
        Set<Integer> list=new TreeSet<>();// Fast random access
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);

        System.out.println(list);

    }
}
