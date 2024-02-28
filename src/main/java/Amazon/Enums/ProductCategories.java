package Amazon.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class ProductCategories {
    public static String BOOKS = "Books";
    public static String MERCHANDISE = "MERCHANDISE";
    public List<String> productCategories;

    public ProductCategories() {
        productCategories = new ArrayList<>();
        productCategories.add(BOOKS);
        productCategories.add(MERCHANDISE);
    }

    public void addNewProductCategory(String category) {
        if (productCategories != null)
            productCategories.add(category);
    }


}
