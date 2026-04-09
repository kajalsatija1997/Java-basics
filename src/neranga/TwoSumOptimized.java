package neranga;

import java.util.Arrays;

public class TwoSumOptimized {
    public static void main(String[] args) {
        int[] arr= {2,7,11,15};
        int target=9;

        System.out.println(Arrays.toString(twoSum(arr, target)));

    }

    public static int[] twoSum(int[] arr,int target)
    {
        int left=0;
        int right= arr.length-1;

        while(left<right)
        {
            int sum=arr[left]+arr[right];

            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target)
            {
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1}; //for edge cases
    }
}
