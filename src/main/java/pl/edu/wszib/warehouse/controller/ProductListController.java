package pl.edu.wszib.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.edu.wszib.warehouse.dao.IProductDAO;
import pl.edu.wszib.warehouse.model.Product;
import org.springframework.ui.Model;

@Controller
public class ProductListController {

    @Autowired
    IProductDAO productDAO;

    @RequestMapping(value = "/productListPage", method = RequestMethod.GET)
    public String getProductsList(Model product) {

        product.addAttribute("productsList", this.productDAO.getAllProducts());

        return "productListPage";
    }
}
