package ordering;

import delivery.Delivery;
import flowerstore.Item;
import lombok.Getter;
import payment.Payment;

import java.util.LinkedList;
@Getter
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    public Order(){
        this.items = new LinkedList<Item>();
    }
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public  void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
    public boolean processOrder(){
        if (this.payment.pay(calculateTotalPrice()) && this.delivery.deliver(items))
            return true;
        return false;
    }

    public  double calculateTotalPrice(){
        double price = 0;
        for (Item item : this.items)
            price +=item.getPrice();
        return price;
    }
}
