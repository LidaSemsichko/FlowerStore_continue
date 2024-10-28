package ua.edu.ucu.flower;

import ua.edu.ucu.order.Item;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private FlowerType flowerType;
    
    public Flower() {
        sepalLength = 0;
        this.setPrice(0);
    }

    public Flower(Flower flower) {
        sepalLength = flower.sepalLength;
        color = flower.color;
        this.setPrice(flower.getPrice());
        flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public FlowerSpecification getSpecification() {
        return new FlowerSpecification(color, flowerType);
    }
}
