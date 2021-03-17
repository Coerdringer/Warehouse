package pl.edu.wszib.warehouse.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.warehouse.dao.ICategoryDAO;
import pl.edu.wszib.warehouse.dao.IProductDAO;
import pl.edu.wszib.warehouse.dao.ITransferDAO;
import pl.edu.wszib.warehouse.dao.impl.CategoryDAOImpl;
import pl.edu.wszib.warehouse.dao.impl.ProductDAOImpl;
import pl.edu.wszib.warehouse.dao.impl.TransferDAOImpl;
import pl.edu.wszib.warehouse.services.IProductService;
import pl.edu.wszib.warehouse.services.impl.ProductServiceImpl;

@Configuration
public class AppConfiguration {
    @Bean
    public SessionFactory hibernateSessionFactory(){
        return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    }

    @Bean
    public IProductDAO productDAO(SessionFactory hibernateSessionFactory){
        return new ProductDAOImpl();
    }
    @Bean
    public IProductService iProductService(ProductDAOImpl productDAO){
        return new ProductServiceImpl();
    }
    @Bean
    public ICategoryDAO categoryDAO(SessionFactory hibernateSessionFactory){ return new CategoryDAOImpl(); }
    @Bean
    public ITransferDAO transferDAO(SessionFactory hibernateSessionFactory){ return new TransferDAOImpl(); }

}

