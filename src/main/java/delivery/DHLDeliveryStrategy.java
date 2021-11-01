package delivery;

import flowerstore.Item;

import java.util.ArrayList;
import java.util.LinkedList;

public class DHLDeliveryStrategy implements  Delivery{
    @Override
    public boolean deliver(LinkedList<Item> items) {
        System.out.printf("Delivering via DHLDeliery");
        return true;
    }
}
