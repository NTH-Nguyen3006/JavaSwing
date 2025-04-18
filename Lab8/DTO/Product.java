package Lab8.DTO;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
