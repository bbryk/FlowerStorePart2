package ordering;

import decorators.PaperDecorator;
import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;
import payment.Payment;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;
    private Payment payment ;
    private Delivery delivery;

    OrderTest() {
    }


    @BeforeEach
    void setUp() {
        this.payment = new PayPalPaymentStrategy();
        this.delivery = new PostDeliveryStrategy();

        this.order = new Order();
        this.order.setPaymentStrategy(this.payment);
        this.order.setDeliveryStrategy(this.delivery);


        Item flower = new Flower(FlowerType.CHAMOMILE);

        ((Flower) flower).setPrice(30);
        Item fl_decorated = new PaperDecorator(flower);
        this.order.addItem(fl_decorated);



    }

    @Test
    void setPaymentStrategy() {
        this.order.setPaymentStrategy(this.payment);
        assertTrue(this.order.getPayment() instanceof  PayPalPaymentStrategy);
    }

    @Test
    void setDeliveryStrategy() {
        this.order.setDeliveryStrategy(this.delivery);
        assertTrue(this.order.getDelivery() instanceof PostDeliveryStrategy);
    }

    @Test
    void addItem() {
        Item fl1 = new Flower(FlowerType.CHAMOMILE);
        Item fl2 = new Flower(FlowerType.ROSE);
        ((Flower) fl1).setPrice(10);
        ((Flower) fl2).setPrice(30);


        this.order.addItem(fl1);
        this.order.addItem(fl2);

        assertTrue(this.order.getItems().contains(fl1));
    }

    @Test
    void removeItem() {
        Item fl1 = new Flower(FlowerType.CHAMOMILE);
        Item fl2 = new Flower(FlowerType.ROSE);
        ((Flower) fl1).setPrice(10);
        ((Flower) fl2).setPrice(30);

        this.order.addItem(fl1);
        this.order.addItem(fl2);

        assertTrue(this.order.getItems().contains(fl1));

        this.order.removeItem(fl1);
        assertFalse(this.order.getItems().contains(fl1));
    }

    @Test
    void processOrder() {
        assertTrue(this.order.processOrder());
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(43, this.order.calculateTotalPrice());
    }
}