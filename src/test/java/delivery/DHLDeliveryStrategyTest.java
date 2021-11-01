package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private Delivery delivery = new DHLDeliveryStrategy();


    @Test
    void deliver() {
        LinkedList<Item> items = new LinkedList<Item>();
        Item fl1 = new Flower(FlowerType.CHAMOMILE);
        Item fl2 = new Flower(FlowerType.ROSE);
        ((Flower) fl1).setPrice(10);
        ((Flower) fl2).setPrice(30);

        items.add(fl1);
        items.add(fl2);
        assertTrue(delivery.deliver(items));
    }
}