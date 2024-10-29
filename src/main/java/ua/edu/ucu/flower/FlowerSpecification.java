package ua.edu.ucu.flower;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowerSpecification {
    private FlowerColor color;
    private FlowerType flowerType;

    public FlowerSpecification(FlowerColor newColor, FlowerType type) {
        this.color = newColor;
        this.flowerType = type;
    }

    public boolean isMatching(FlowerSpecification otherSpec) {
        return this.color.equals(otherSpec.color) && this.flowerType.equals(otherSpec.flowerType);
    }

    @Override
    public String toString() {
        return color.toString() + " " + flowerType.toString();
    }
}
