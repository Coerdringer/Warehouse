package pl.edu.wszib.warehouse.controller.add;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.warehouse.dao.ICategoryDAO;
import pl.edu.wszib.warehouse.model.Category;

@Controller
public class AddCategoryController {

    @Autowired
    ICategoryDAO categoryDAO;

    @RequestMapping(value = "/addCategoryPage",method = RequestMethod.GET)
    public ModelAndView addCategory(){
        return new ModelAndView("add/addCategoryPage","categoryKey",new Category());
    }

    @RequestMapping(value = "/addCategoryPage",method = RequestMethod.POST)
    public String addCategoryForm(@ModelAttribute("categoryKey") Category category){
        this.categoryDAO.saveCategory(category);
        return  "addMenuPage";
    }
}
