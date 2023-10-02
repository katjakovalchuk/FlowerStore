package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Flower {
    private double sepalLength;
    private double price;
    private FlowerColor color;
    private FlowerType flowerType;
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
