package ua.edu.ucu.flower;

import ua.edu.ucu.order.Item;
import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower extends Item {
    @Getter
    private double lengthOfSepal;
    private FlowerColor flowerColor;
    @Getter
    private FlowerType typeOfFlower;

    public Flower() {
        lengthOfSepal = 0;
        this.setPrice(0);
    }

    public Flower(Flower existingFlower) {
        this.lengthOfSepal = existingFlower.lengthOfSepal;
        this.flowerColor = existingFlower.flowerColor;
        this.setPrice(existingFlower.getPrice());
        this.typeOfFlower = existingFlower.typeOfFlower;
    }

    public String getFlowerColor() {
        return flowerColor.toString();
    }

    public FlowerSpecification getFlowerDetails() {
        return new FlowerSpecification(flowerColor, typeOfFlower);
    }
}
