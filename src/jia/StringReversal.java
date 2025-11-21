package jia;

public class StringReversal {
    public static void main(String[] args) {
        String s="Jia";
        String reversed="";
        for(int i=s.length()-1;i>0;i--) {
            System.out.println(reversed+s.charAt(i));
        }
    }
}
