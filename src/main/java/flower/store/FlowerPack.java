package flower.store;

import lombok.Getter;
import lombok.Setter;

public class FlowerPack {
    private Flower flower;
    @Getter
    @Setter
    private int quantity;

    public FlowerPack(Flower flower, int quantity2) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity < 0 ? 0 : quantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();

    };
}
