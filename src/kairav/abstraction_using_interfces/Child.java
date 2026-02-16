package kairav.abstraction_using_interfces;

public class Child extends Parent implements A{
    @Override
    public void show() {
        A.super.show();
    }
}
