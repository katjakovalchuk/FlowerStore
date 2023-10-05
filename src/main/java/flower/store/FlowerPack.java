package flower.store;

import lombok.Getter;
import lombok.Setter;

public class FlowerPack {
    private Flower flower;
    @Getter
    @Setter
    private int quantity = 1;

    public FlowerPack(Flower flower, int quantity2) {
        this.flower = flower;
        this.setQuantity(quantity2); 
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity <= 0 ?  1 : quantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    };
}
