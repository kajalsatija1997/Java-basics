package kairav.abstraction_using_interfces;

public class PaymentDriver {
    public static void main(String[] args) {
        Payment payment=new CreditCardPayment();
        payment.pay();
    }
}
