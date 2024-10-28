package ua.edu.ucu.flower;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowerSpecification {
    private FlowerColor color;
    private FlowerType flowerType;

    public FlowerSpecification(FlowerColor colorNew, FlowerType type) {
        color = colorNew;
        flowerType = type;
    }
    public boolean matches(FlowerSpecification anotherSpec) {
        return color.equals(anotherSpec.color) 
        && flowerType.equals(anotherSpec.flowerType);
    }
    public String toString(){
        return color.toString() + flowerType.toString();
    }
}
