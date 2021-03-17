package pl.edu.wszib.warehouse.controller.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.warehouse.dao.ICategoryDAO;
import pl.edu.wszib.warehouse.model.Category;

@Controller
public class DeleteCategoryController {

    @Autowired
    ICategoryDAO categoryDAO;

    @RequestMapping(value = "/deleteCategoryPage",method = RequestMethod.GET)
    public ModelAndView deleteCategory(){
        return new ModelAndView("delete/deleteCategoryPage","categoryKey",new Category());
    }

    @RequestMapping(value = "/deleteCategoryPage",method = RequestMethod.POST)
    public String deleteCategoryForm(@ModelAttribute("categoryKey") Category category){
        this.categoryDAO.deleteCategory(category);
        return  "deleteMenuPage";
    }

}
