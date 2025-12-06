package jia.inheritence;

public class AnimalRunner {

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setCost(20);
        dog.setColor("Black");
        dog.isBark();

        System.out.println(dog);
    }
}
