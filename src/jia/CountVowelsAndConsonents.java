package jia;

public class CountVowelsAndConsonents {
    public static void main(String[] args) {
        String s="Interview";
        //s.tolowercase-> interview
        int vowels=0;
        int consonants=0;
        String s1=String.valueOf(100);
        String s2=String.valueOf(true);

        //1st operation- s.toLowerCase() - interview
        //2nd op- ['i','n','t','e','r','v','i','e','w']
        for(char c: s.toLowerCase().toCharArray()) //'A'/'a'
        {
            if(Character.isLetter(c))
            {
               /* if("aeiou".indexOf(c)!=-1)
                {
                    vowels++;
                }
                else {
                    consonants++;
                }*/
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: "+vowels+"->"+"Consonents: "+consonants);
    }
}
