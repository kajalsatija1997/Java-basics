package kairav.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //Given an array - [1,2,3]
    //Generate all possible subsets
    // [] , [1], [1,2], [1,2,3], [1,3], [2], [2,3], [3]
    //Total subsets--> 2 ^3 --> 8

    //Start with empty set
    // try adding each number
    // explore deeper combinations
    // backtrack and try other possibilities

    static List<List<Integer>>  result=new ArrayList<>();

    public static List<List<Integer>> subsets(int[] nums)
    {
        backtrack(nums,0,new ArrayList<>());
        return  result;
    }

    public static void backtrack(int[] nums,int start, List<Integer> temp)
    {
        result.add(new ArrayList<>(temp));

        for(int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            backtrack(nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));

    }
}
