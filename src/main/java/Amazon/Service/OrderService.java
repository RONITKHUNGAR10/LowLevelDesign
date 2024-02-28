package Amazon.Service;

import Amazon.Entities.Order;
import Amazon.Enums.OrderStatus;

public interface OrderService {



    Order updateOrderStatus(OrderStatus orderStatus,Order order);

    boolean cancelOrder(Order order);



}
