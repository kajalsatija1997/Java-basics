package kairav;

public class OperatorsExample {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int[]a = new int[]{100, 200, 300};

       arr=a; //PASS BY REFERENCE
        System.out.println(arr[1]);
    }
    static void modify(int[] a) {
        a = new int[]{100, 200, 300}; //PASS BY VALUE
    }
}
