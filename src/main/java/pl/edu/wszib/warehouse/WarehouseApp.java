package pl.edu.wszib.warehouse;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.edu.wszib.warehouse.configuration.AppConfiguration;
import pl.edu.wszib.warehouse.model.Product;
import pl.edu.wszib.warehouse.services.IProductService;

@SpringBootApplication
public class WarehouseApp {
    public static void main(String[] args) {
        SpringApplication.run(WarehouseApp.class, args);
    }
}
