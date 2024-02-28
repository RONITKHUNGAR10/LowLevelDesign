package Amazon.Service;

import Amazon.Entities.Cart;
import Amazon.Entities.Item;
import Amazon.Entities.Order;

public interface CartService {

    boolean addItemToCart(Item item);

    boolean removeItemFromCart(Item item);

    Order checkOutCart();

}
