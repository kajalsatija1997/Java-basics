package p44;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //an array is given
        //1. reversing the whole array
        //2. pick the first element and place it in the end
        //sort the array and give in min number of steps, otherwise return -1

        //reverse-
        //[3,4,5,1,2]

        //rotate- [4,5,1,2,3]
        //rotate -[5,1,2,3,4]
        //rotate-[1,2,3,4,5]


        //arr- 2,1,5,4,3

        //[1,5,4,3,2]
        //[5,4,3,2,1]
        //reverse-[1,2,3,4,5]

        int[] arr={6,5,4,3,2,1,8,7};
        System.out.println(minOps(arr));


    }

    public static int minOps(int[] arr)
    {
        int size=arr.length;
        int incBreak=0;
        int decBreak=0;

        int minIndex=0;
        int maxIndex=0;

        for(int i=0;i<size;i++)
        {
            if(arr[i]>arr[(i+1) %size])
                incBreak++;

            if(arr[i]<arr[(i+1)%size])
                decBreak++;

            if(arr[i]<arr[minIndex])
                minIndex=i;


        }

        int option1=Integer.MAX_VALUE;
        int option2=Integer.MIN_VALUE;

        //Rotation of sorted
        if(incBreak<=1) {
            option1= minIndex;
        }

        //Rotation of reverse sorted
        if(decBreak<=1) {
            option2= 1+((size-minIndex)%size);
        }

        int result= Math.min(option1,option2);
        return  result==Integer.MAX_VALUE?-1:result;
    }


    //

}
