package payment;

import payment.Payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Paid %f with PayPal", price);
        return true;
    }
}
