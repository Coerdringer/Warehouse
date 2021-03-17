package pl.edu.wszib.warehouse.model;

import javax.persistence.*;

@Entity
@Table(name = "tproduct")
public class Product {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String name;
    private String category;
    private double price;
    private double quantity;   //quantity -> all product.
    private int ALARM;
    //private int qimw;       //qimw -> Quantity in main warehouse.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getALARM() {
        return ALARM;
    }

    public void setALARM(int ALARM) {
        this.ALARM = ALARM;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ALARM=" + ALARM +
                '}';
    }
}
