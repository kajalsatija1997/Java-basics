package kairav;

public class ArraysTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        for(int i = 0; i < arr.length; i++) {
         //2%4-->2
            arr[i] = arr[(arr[i] + 1) % arr.length];
        }
        System.out.println(arr[0]);


    }
}
