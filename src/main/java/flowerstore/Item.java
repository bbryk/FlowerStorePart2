package flowerstore;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    protected String description;
    public abstract double getPrice();
    public  String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

}
