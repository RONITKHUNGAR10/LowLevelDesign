package Amazon.Entities;

import Amazon.Enums.ProductCategories;
import Amazon.Service.ProductService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.util.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@Setter
public class ProductCatalogue implements ProductService {
    private static List<Product> productList;


    @Override
    public void addProductToCategory(Product product) {
        if (productList == null)
            productList = new ArrayList<>();
        if(checkValidProductCategory(product.getProductCategory()))
        productList.add(product);
    }

    @Override
    public void addProductCategory(String category) {
        ProductCategories productCategories = new ProductCategories();

        productCategories.addNewProductCategory(category);
    }

    private boolean checkValidProductCategory(String category) {
        ProductCategories productCategories = new ProductCategories();
        return productCategories.getProductCategories().contains(category);
    }

    @Override
    public List<Product> searchByProductName(String productName) {
        List<Product> result = new ArrayList<>();
        if (productList != null && Strings.isNotBlank(productName)) {
            result = productList.stream().filter(product -> product.getProductName().equalsIgnoreCase(productName)).collect(Collectors.toList());
        }
        return result;
    }

    @Override
    public List<Product> searchByProductCategory(String productCategory) {
        List<Product> result = new ArrayList<>();
        if (productList != null && Strings.isNotBlank(productCategory)) {
            result = productList.stream().filter(product -> product.getProductName().equalsIgnoreCase(productCategory)).collect(Collectors.toList());
        }
        return result;
    }


}
