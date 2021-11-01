package delivery;

import flowerstore.Item;

import java.util.ArrayList;
import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery{

    @Override
    public boolean deliver(LinkedList<Item> items) {
        System.out.printf("Delivering via PostDeliery");

        return true;
    }
}
