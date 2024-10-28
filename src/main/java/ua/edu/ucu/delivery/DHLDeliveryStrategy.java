package ua.edu.ucu.delivery;

import java.util.List;
import ua.edu.ucu.order.Item;

public class DHLDeliveryStrategy implements Delivery {
    private final String deliveryDescription;

    public DHLDeliveryStrategy() {
        this.deliveryDescription = "DHL Delivery Service";
    }

    @Override
    public String deliver(List<Item> items) {
        StringBuilder message = new StringBuilder("Total items delivered: ");
        message.append(items.size());
        message.append("; Delivery Method: ").append(deliveryDescription);
        return message.toString();
    }
}
