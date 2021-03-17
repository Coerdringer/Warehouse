package pl.edu.wszib.warehouse.dao;

import pl.edu.wszib.warehouse.model.Category;

import java.util.List;

public interface ICategoryDAO {
    void saveCategory(Category category);
    void deleteCategory(Category category);
    List<Category> getAllCategories();
}
