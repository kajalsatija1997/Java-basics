package kairav.abstraction_using_abstract;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal obj =new Dog();
        obj.sound();
        obj.sleep();

      //Can't create objects of abstract classes
        // Can have both abstract and concrete methods
        //Can have constructors
    }
}
