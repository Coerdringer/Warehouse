package pl.edu.wszib.warehouse.model;

import javax.persistence.*;

@Entity
@Table(name = "treport")
public class Report {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int reportId;
    private int locationId;
    private String productName;
    private double quantity;
    private String shopName;
    private String username;

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", locationId=" + locationId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", shopName='" + shopName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
