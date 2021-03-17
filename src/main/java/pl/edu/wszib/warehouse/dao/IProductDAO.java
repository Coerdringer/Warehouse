package pl.edu.wszib.warehouse.dao;

import pl.edu.wszib.warehouse.model.Product;

import java.util.List;

public interface IProductDAO {
    void saveProduct(Product product);
    void deleteProduct(Product product);
    List<Product> getAllProducts();
    void updateProduct(Product product);
}
