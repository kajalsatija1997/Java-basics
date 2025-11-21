package jia;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println("Enter any string to experiment?");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s==null || s.isEmpty())
            System.out.println("String is empty");

        int[] freq= new int[256]; // for all ASCII characters


        //Count frequency
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }

        //Find first character with frequency =1
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)]==1){
                //System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
