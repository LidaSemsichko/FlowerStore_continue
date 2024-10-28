package ua.edu.ucu.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
    
    @GetMapping("/flowers")
    public static List<Flower> getFlowerList() {
        Flower firstFlower = new Flower();
        Flower secondFlower = new Flower();
        Flower thirdFlower = new Flower();
        
        firstFlower.setFlowerColor(FlowerColor.RED);
        
        secondFlower.setFlowerColor(FlowerColor.RED);
        
        thirdFlower.setFlowerColor(FlowerColor.RED);
        
        return List.of(firstFlower, secondFlower, thirdFlower);
    }
}
