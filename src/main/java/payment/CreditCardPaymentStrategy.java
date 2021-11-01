package payment;

import payment.Payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public boolean pay(double price) {
        System.out.format("Paid %f with Credit Card", price);
        return true;
    }
}
