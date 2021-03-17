package pl.edu.wszib.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddMenuController {

    @RequestMapping(value = "/addMenuPage", method = RequestMethod.GET)
    public String addMenuPage() { return "addMenuPage"; }

    @RequestMapping(value = "/add/addProductPage", method = RequestMethod.GET)
    public String addProductPage() {
        return "redirect:/addProductPage";
    }

    @RequestMapping(value = "/add/addCategoryPage", method = RequestMethod.GET)
    public String addCategoryPage() {
        return "redirect:/addCategoryPage";
    }
}
