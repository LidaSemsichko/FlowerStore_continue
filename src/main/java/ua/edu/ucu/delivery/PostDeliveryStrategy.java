package ua.edu.ucu.delivery;

import java.util.List;
import ua.edu.ucu.order.Item;

public class PostDeliveryStrategy implements Delivery {
    private final String deliveryMethod;

    public PostDeliveryStrategy() {
        deliveryMethod = "Postal Delivery Method";
    }

    @Override
    public String deliver(List<Item> items) {
        StringBuilder result = new StringBuilder("Delivered a total of ");
        result.append(items.size());
        result.append(" items via ").append(deliveryMethod);
        return result.toString();
    }
}
