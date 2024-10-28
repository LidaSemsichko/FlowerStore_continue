package ua.edu.ucu.deliver;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.flower.Flower;
import ua.edu.ucu.order.Item;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class DHLDeliveryStrategyTest {
    
    @Test
    public void testDeliverWithNoItems() {
        DHLDeliveryStrategy deliveryStrategy = new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();
        String result = deliveryStrategy.deliver(items);
        assertEquals("Delivered 0 items;DHLDelivery", result);
    }

    @Test
    public void testDeliverWithSomeItems() {
        DHLDeliveryStrategy deliveryStrategy = new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();
        items.add(new Flower());
        items.add(new Flower());
        String result = deliveryStrategy.deliver(items);
        assertEquals("Delivered 2 items;DHLDelivery", result);
    }

    @Test
    public void testGetDescription() {
        DHLDeliveryStrategy deliveryStrategy = new DHLDeliveryStrategy();
        assertEquals("DHLDelivery", deliveryStrategy.getDescription());
    }
}
