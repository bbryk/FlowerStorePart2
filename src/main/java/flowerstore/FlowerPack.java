package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack extends Item{
    private Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public int addFlower(Flower flower) {
        if (this.flower != null) {
            if (flower.equals(this.flower))
                this.amount++;
            else
                return 1;
        } else {
            this.flower = flower;
            this.amount = 1;
        }
        return  0;
    }

}
