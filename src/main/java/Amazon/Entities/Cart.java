package Amazon.Entities;

import Amazon.Enums.OrderStatus;
import Amazon.Service.CartService;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cart implements CartService {
    private static int orderId =1;
    int cartId;
    List<Item> items;
    int totalPrice;
    boolean isCheckedOut;

    @Override
    public boolean addItemToCart(Item item) {
        if(item!=null){
            items.add(item);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeItemFromCart(Item item) {
        if(item!=null){
            items.remove(item);
            return true;
        }
        return false;
    }

    @Override
    public Order checkOutCart() {
        //initiatePayment by creating object
        isCheckedOut = true;
        Order order = new Order(orderId++, new Date(), OrderStatus.CREATED,items);
        items = new ArrayList<>();
        return order;
    }
}
