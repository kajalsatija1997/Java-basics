package arsh;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        int size=nums.length;

        System.out.println("Majority Element: "+majority(nums,size));

    }

    private static int majority(int [] nums,int size)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            /*if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
            if(map.get(num)>size/2)
            {
                return num;
            }*/
            map.put(num,map.getOrDefault(num,0));
            if(map.get(num)>size/2)
            {
                return num;
            }
        }
        return -1;
    }
}
