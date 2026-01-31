package kairav;

public class PostPreIncrementQuestions {

    // Post increment-->use value first, then increment
    //Pre increment-->first increment, then use
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += ++arr[i];
        }

        System.out.println(sum);

    }
}
