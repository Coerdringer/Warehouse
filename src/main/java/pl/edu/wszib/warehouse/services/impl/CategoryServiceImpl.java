package pl.edu.wszib.warehouse.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.warehouse.dao.ICategoryDAO;
import pl.edu.wszib.warehouse.model.Category;
import pl.edu.wszib.warehouse.services.ICategoryService;

@Component
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    ICategoryDAO categoryDAO;

    public void saveCategory(Category category) {
        categoryDAO.saveCategory(category);
    }
}
