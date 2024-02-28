package Amazon.Entities;

import Amazon.Enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    int orderId;
    Date createdDate;
    OrderStatus orderStatus;
    List<Item> items;

}
