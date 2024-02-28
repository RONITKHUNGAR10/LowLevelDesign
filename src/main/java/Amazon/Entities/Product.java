package Amazon.Entities;

import Amazon.Enums.ProductCategories;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    int productId;
    String productName;
    String productCategory;
    int price;
    Date manufacturingDate;
    Date expiryDate;
    Map<Integer,String> reviews;//can be upgraded to map(user wise product review)

}
