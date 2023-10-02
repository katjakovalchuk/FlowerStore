package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tulip extends Flower {

    private double sepalLength;
    private double price;
    private FlowerColor color;

    public Tulip(Tulip tulip) {
        this.sepalLength = tulip.sepalLength;
        this.price = tulip.price;
        this.color = tulip.color;
    }
}
