package kairav.abstraction_using_interfces;

public interface Payment {
    //before Java 8- only abstract methods
    void pay();

    //Default and static method after Java 8
    default void test()
    {
        System.out.println("Default test");
    }
}
