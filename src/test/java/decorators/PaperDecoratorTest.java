package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    @Test
    void getPrice() {
        Item flower = new Flower(FlowerType.CHAMOMILE);
        ((Flower) flower).setPrice(14);
        Item fl_decorated = new PaperDecorator(flower);
        assertEquals(fl_decorated.getPrice(), 27.0);
    }
}