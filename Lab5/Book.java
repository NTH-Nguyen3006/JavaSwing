package Lab5;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book {
    private int ID;
    private String title;
    private double price;

    public Book() {}

//    public Book(ResultSet rs) throws SQLException {
//        this.ID = rs.getString("ID");
//        this.title = rs.getString("title");
//        this.price = rs.getFloat("price");
//    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
