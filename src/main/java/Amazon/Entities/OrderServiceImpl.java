package Amazon.Entities;

import Amazon.Enums.OrderStatus;
import Amazon.Service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public Order updateOrderStatus(OrderStatus orderStatus, Order order) {
        //send notification
        return order;
    }

    @Override
    public boolean cancelOrder(Order order) {
        //sendNotification
        return false;
    }
}
