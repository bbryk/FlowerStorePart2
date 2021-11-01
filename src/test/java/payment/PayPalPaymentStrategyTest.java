package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private Payment payment;
    private double price;

    @BeforeEach
    void setUp() {
        this.payment = new PayPalPaymentStrategy(); //
        this.price = 100;
    }

    @Test
    void pay() {
        assertTrue(this.payment.pay(price));
    }
}