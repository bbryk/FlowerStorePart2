package payment;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private Payment payment;
    private double price;
    private LinkedList<Item> items = new LinkedList<Item>();

    @BeforeEach
    void setUp() {
        this.payment = new CreditCardPaymentStrategy();
        this.price = 100;
        Item fl1 = new Flower(FlowerType.CHAMOMILE);
        Item fl2 = new Flower(FlowerType.ROSE);
        ((Flower) fl1).setPrice(10);
        ((Flower) fl2).setPrice(30);

        this.items.add(fl1);
        this.items.add(fl2);
    }

    @Test
    void pay() {
        assertTrue(this.payment.pay(price));
    }
}