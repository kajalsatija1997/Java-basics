package kairav.abstraction_using_abstract;

public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void sound();

    void sleep() {
        System.out.println("Sleeping..");
    }

    public Animal() {

    }
}