package ua.edu.ucu.delivery;

import java.util.List;

import ua.edu.ucu.order.Item;

public class PostDeliveryStrategy implements Delivery {
    private String description;
    public PostDeliveryStrategy(){
        description = "Post Delivery";
    }
    public String deliver(List<Item> items){
        StringBuilder str = new StringBuilder("Delivered ");
        str.append(items.size());
        str.append(" items;" + description);
        return str.toString();
    }
}
