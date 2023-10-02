package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chamomile extends Flower {
    // public Chamomile(Flower flower) {
    // super(flower);
    // // TODO Auto-generated constructor stub
    // }

    private double sepalLength;
    private double price;
    private FlowerColor color;

    public Chamomile(Chamomile chamomile) {
        this.sepalLength = chamomile.sepalLength;
        this.price = chamomile.price;
        this.color = chamomile.color;
    }

}
