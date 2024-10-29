package ua.edu.ucu.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public FlowerBucket(List<FlowerPack> packs) {
        this.flowerPacks = new ArrayList<>(packs);
    }

    public void addFlowerPack(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double calculateTotalPrice() {
        return flowerPacks.stream().mapToDouble(FlowerPack::getPrice).sum();
    }
}
