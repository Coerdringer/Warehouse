package pl.edu.wszib.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/optionPages/addProductPage", method = RequestMethod.GET)
    public String addProductPage() {
        return "addProductPage";
    }

    @RequestMapping(value = "/optionPages/deleteProductPage", method = RequestMethod.GET)
    public String deleteProductPage() {
        return "deleteProductPage";
    }

    @RequestMapping(value = "/optionPages/updateProductPage", method = RequestMethod.GET)
    public String updateProductPage() {
        return "updateProductPage";
    }

    @RequestMapping(value = "/optionPages/productListPage", method = RequestMethod.GET)
    public String productListPage() {
        return "productListPage";
    }
}
