package ua.edu.ucu.delivery;

import java.util.List;
import ua.edu.ucu.order.Item;
import lombok.Getter;
@Getter
public class DHLDeliveryStrategy implements Delivery {
    private String description;
    public DHLDeliveryStrategy(){
        description = "DHLDelivery";
    }
    public String deliver(List<Item> items){
        StringBuilder str = new StringBuilder("Delivered ");
        str.append(items.size());
        str.append(" ," + description);
        return str.toString();
    }
    
}
