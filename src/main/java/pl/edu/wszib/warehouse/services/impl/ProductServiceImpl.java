package pl.edu.wszib.warehouse.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.warehouse.dao.IProductDAO;
import pl.edu.wszib.warehouse.model.Product;
import pl.edu.wszib.warehouse.services.IProductService;

import java.util.Date;

@Component
public class ProductServiceImpl implements IProductService {

@Autowired
IProductDAO productDAO;

    public void saveProduct(Product product) {
        productDAO.saveProduct(product);
    }
}
