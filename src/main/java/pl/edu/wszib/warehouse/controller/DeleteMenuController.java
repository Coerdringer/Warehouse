package pl.edu.wszib.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteMenuController {

    @RequestMapping(value = "/deleteMenuPage", method = RequestMethod.GET)
    public String deleteMenuPage() {
        return "deleteMenuPage";
    }

    @RequestMapping(value = "/delete/deleteProductPage", method = RequestMethod.GET)
    public String deleteProductPage() {
        return "redirect:/deleteProductPage";
    }

    @RequestMapping(value = "/delete/deleteCategoryPage", method = RequestMethod.GET)
    public String deleteCategoryPage() {
        return "redirect:/deleteCategoryPage";
    }
}