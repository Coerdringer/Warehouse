package pl.edu.wszib.warehouse.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import pl.edu.wszib.warehouse.dao.ICategoryDAO;
import pl.edu.wszib.warehouse.model.Category;

import java.util.List;

@Component
public class CategoryDAOImpl implements ICategoryDAO {

    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public CategoryDAOImpl() {

    }

    public void saveCategory(Category category) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(category);
            //wiecej operacji
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteCategory(Category category) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(category);
            //wiecej operacji
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Category> getAllCategories() {
        Session session = factory.openSession();

        List categories = session
                .createQuery("FROM pl.edu.wszib.warehouse.model.Category")
                .list();
        session.close();
        return categories;

    }
}
