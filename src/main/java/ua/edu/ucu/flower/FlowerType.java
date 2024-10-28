package ua.edu.ucu.flower;

public enum FlowerType {
    CHAMOMILE("Chamomile"), ROSE("Rose"), TULIP("Tulip");
    
    private final String displayName;

    FlowerType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
