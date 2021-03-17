package pl.edu.wszib.warehouse.dao.impl;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import pl.edu.wszib.warehouse.dao.IProductDAO;
import pl.edu.wszib.warehouse.model.Product;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductDAOImpl implements IProductDAO {

    private List<Product> productsList = new ArrayList<>();

    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public ProductDAOImpl() {

    }

    public void saveProduct(Product product) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(product);
            //wiecej operacji
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteProduct(Product product) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(product);
            //wiecej operacji
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void updateProduct(Product product) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(product);
            //wiecej operacji
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Product> getAllProducts() {
        Session session = factory.openSession();

        List products = session
                .createQuery("FROM pl.edu.wszib.warehouse.model.Product")
                .list();
        session.close();
        return products;
    }
}
