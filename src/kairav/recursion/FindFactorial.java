package kairav.recursion;

public class FindFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num)
    {
        if(num==0) { //Base case
            return 1;
        }
        return num * factorial(num-1); // Recursive case

    }

}
