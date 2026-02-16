package basia;

public class MainClass {
    public static void main(String[] args) {
        Animal a=new Dog(); // Upcasting
        a.sound(); //JVM decides at runtime which sound() to call
        //Child class method us executed --> method overriding
    }
}
