package Amazon.Service;

import Amazon.Entities.Product;
import Amazon.Entities.ProductCatalogue;

import java.util.List;

public interface ProductService {
    void addProductToCategory(Product product);

    void addProductCategory(String category);

    List<Product> searchByProductName(String productName);

    List<Product> searchByProductCategory(String productName);

}
