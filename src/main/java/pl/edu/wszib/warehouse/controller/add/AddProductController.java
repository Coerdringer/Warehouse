package pl.edu.wszib.warehouse.controller.add;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.warehouse.dao.ICategoryDAO;
import pl.edu.wszib.warehouse.dao.IProductDAO;
import pl.edu.wszib.warehouse.model.Category;
import pl.edu.wszib.warehouse.model.Product;

@Controller
public class AddProductController {

    @Autowired
    IProductDAO productDAO;
    @Autowired
    ICategoryDAO categoryDAO;

    @RequestMapping(value = "/addProductPage",method = RequestMethod.GET)
    public ModelAndView addProduct(){
        return new ModelAndView("add/addProductPage","productKey",new Product());
    }

    @RequestMapping(value = "/addProductPage",method = RequestMethod.POST)
    public String addProductForm(@ModelAttribute("productKey") Product product){
        this.productDAO.saveProduct(product);
        return  "addMenuPage";
    }

/*    @RequestMapping(value = "/addProductPage",method = RequestMethod.GET)
    public ModelAndView categoryList(){
        return new ModelAndView("add/addProductPage","categoryList",new Category());
    }

    @RequestMapping(value = "/addProductPage", method = RequestMethod.GET)
    public String getCategoryList(Model category) {

        category.addAttribute("categoryList", this.categoryDAO.getAllCategories());

        return "addProductPage";
    }*/

}