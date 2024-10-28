package ua.edu.ucu.delivery;
import java.util.List;

import ua.edu.ucu.order.Item;

public interface Delivery {
    public String deliver(List<Item> items);
}