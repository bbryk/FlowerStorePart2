package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();
    List<Flower> flowers = new ArrayList<Flower>();
    public boolean search(Object obj) {
        if (obj instanceof FlowerPack) {
            for (FlowerPack flowerPack : flowerPacks) {
                if (flowerPack.equals(obj))
                    return true;
            }
        } else if (obj instanceof FlowerBucket) {
            for (FlowerBucket flowerBucket : flowerBuckets) {
                if (flowerBucket.equals(obj))
                    return true;
            }
        }else if (obj instanceof Flower) {
            for (Flower flower : flowers) {
                if (flower.equals(obj))
                    return true;
            }
        }
        return false;
    }
}