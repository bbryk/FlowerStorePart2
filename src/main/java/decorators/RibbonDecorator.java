package decorators;

import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator{

    public RibbonDecorator(Item item) {
        super(item);

    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
