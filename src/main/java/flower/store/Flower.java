package flower.store;

import flower.store.items.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower extends Item {
    private double sepalLength;
    private double price;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return this.color.toString();
    }

    public Flower() {
    }
    // @Getter
    // private double sepalLength;
    // private FlowerColor color;
    // @Getter
    // private double price;
    // @Getter
    // private FlowerType flowerType;

    // public String getColor() {
    // return color.toString();
    // }
}
