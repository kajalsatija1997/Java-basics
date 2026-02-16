package kairav.abstraction_using_interfces;

public class CreditCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid via Credit card..");
    }
}
