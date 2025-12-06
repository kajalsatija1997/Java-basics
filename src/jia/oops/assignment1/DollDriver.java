package jia.oops.assignment1;

public class DollDriver {
    public static void main(String[] args) {
        Doll doll1=new Doll();
        doll1.setName("Stacy");
        doll1.setInteractive(true);

        Doll doll2=new Doll();
        doll2.setName("Tammy");
        doll2.setInteractive(false);

        System.out.println(doll1    );
        System.out.println(doll2);

        //change name using setter
        doll1.setName("Ariana");
        System.out.println(doll1);

        System.out.println(doll1.getName());
    }
}
