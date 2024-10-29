package ua.edu.ucu.deliver;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.delivery.PostDeliveryStrategy;
import ua.edu.ucu.flower.Flower;
import ua.edu.ucu.order.Item;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostDeliveryStrategyTest {

    @Test
    public void testDeliverWithNoItems() {
        PostDeliveryStrategy deliveryStrategy = new PostDeliveryStrategy();
        List<Item> items = new ArrayList<>();
        String result = deliveryStrategy.deliver(items);
        assertEquals("Delivered 0 ,Post Delivery", result);
    }

    @Test
    public void testDeliverWithSomeItems() {
        PostDeliveryStrategy deliveryStrategy = new PostDeliveryStrategy();
        List<Item> items = new ArrayList<>();
        items.add(new Flower());
        items.add(new Flower());
        String result = deliveryStrategy.deliver(items);
        assertEquals("Delivered 2 ,Post Delivery", result);
    }
}
