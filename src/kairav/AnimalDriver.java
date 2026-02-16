package kairav;

public class AnimalDriver {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("Bruno");
        dog.setColour("Beige");

        Dog dog1=new Dog();
        dog.setName("Bruno");
        dog.setColour("Beige");

        System.out.println(dog.makeSound());
        System.out.println(dog);


    }
}
