package pl.edu.wszib.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.warehouse.dao.IProductDAO;
import pl.edu.wszib.warehouse.model.Product;

@Controller
public class UpdateProductController {
    @Autowired
    IProductDAO productDAO;

    @RequestMapping(value = "/updateProductPage",method = RequestMethod.GET)
    public ModelAndView addProduct(){
        return new ModelAndView("updateProductPage","productKey",new Product());
    }

    @RequestMapping(value = "/updateProductPage",method = RequestMethod.POST)
    public String addProductForm(@ModelAttribute("productKey") Product product){
        this.productDAO.updateProduct(product);
        return  "index";
    }
}
