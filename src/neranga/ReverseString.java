package neranga;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        // A string->hello
        String name="hello";
        char[] nameArray=name.toCharArray();
       // System.out.println(Arrays.toString(reverseStringBrute(nameArray)));
        reverseStringOptimized(nameArray);
        System.out.println(nameArray);
    }

    public static char[] reverseStringBrute(char[] nameArray)
    {
        char[] result=new char[nameArray.length];

        for(int i=0;i<nameArray.length;i++)
        {
            result[i]=nameArray[nameArray.length-1-i];
        }
        return result;
    }

    public static void reverseStringOptimized(char[] nameArray)
    {
       int left=0;
       int right = nameArray.length-1;

       while(left<right)
       {
          char temp= nameArray[left];
          nameArray[left]=nameArray[right];
          nameArray[right]=temp;

          left++;
          right--;
       }
    }
}
