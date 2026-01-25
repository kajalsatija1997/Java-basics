package Swetha.execptionHandling;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
    Product product1=new Product(1,"R1","B1",10);
    Product product2=null;
        System.out.println(product1.getProductName());
        //System.out.println(product2.getProductName());
        System.out.println(product1.getItemsAvailable());
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter id for product 3: ");
        int id= Integer.parseInt(scanner.next());
        Product product3=new Product(id,"R1","B1",10);
        System.out.println(product3);

    }
}
