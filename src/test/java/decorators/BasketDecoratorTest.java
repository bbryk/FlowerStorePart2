package decorators;

import flowerstore.FlowerType;
import flowerstore.Item;
import flowerstore.Flower;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Item flower = new Flower(FlowerType.CHAMOMILE);
        ((Flower) flower).setPrice(14);
        Item fl_decorated = new BasketDecorator(flower);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        Item flower = new Flower(FlowerType.CHAMOMILE);
        ((Flower) flower).setPrice(14);
        Item fl_decorated = new BasketDecorator(flower);
        assertEquals(fl_decorated.getPrice(), 18.0);
    }

    @org.junit.jupiter.api.Test
    void getDescription() {
    }
}