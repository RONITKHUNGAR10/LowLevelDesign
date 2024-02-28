package Amazon.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private String userName;
    private String email;
    private String name;
    private String Address;
    List<String> credit;
    int phoneNumber;
    Cart cart;
    List<Order> orders;

    public void addItemToCart(Item item){
        if(cart==null)
        this.cart = new Cart();
        cart.addItemToCart(item);
    }

    public void removeItemFromCart(Item item){
        this.cart.removeItemFromCart(item);
    }

    public void checkoutCart(){
      Order order =  this.cart.checkOutCart();
      if(orders==null)
          orders= new ArrayList<>();
      orders.add(order);
    }
}
