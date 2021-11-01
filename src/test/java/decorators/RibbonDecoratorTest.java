package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    @Test
    void getPrice() {
        Item flower = new Flower(FlowerType.CHAMOMILE);
        ((Flower) flower).setPrice(14);
        Item fl_decorated = new RibbonDecorator(flower);
        assertEquals(fl_decorated.getPrice(), 54.0);
    }
}