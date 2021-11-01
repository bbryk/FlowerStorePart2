package delivery;

import flowerstore.Item;

import java.util.LinkedList;

public interface Delivery {
    boolean deliver(LinkedList<Item> items);
}
