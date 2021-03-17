package pl.edu.wszib.warehouse.controller.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.warehouse.dao.IProductDAO;
import pl.edu.wszib.warehouse.model.Product;

@Controller
public class DeleteProductController {

    @Autowired
    IProductDAO productDAO;

    @RequestMapping(value = "/deleteProductPage",method = RequestMethod.GET)
    public ModelAndView deleteProduct(){ return new ModelAndView("delete/deleteProductPage","productKey",new Product()); }

    @RequestMapping(value = "/deleteProductPage",method = RequestMethod.POST)
    public String deleteProductForm(@ModelAttribute("productKey") Product product){
        this.productDAO.deleteProduct(product);
        return  "deleteMenuPage";
    }
}