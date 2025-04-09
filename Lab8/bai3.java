package Lab8;

import Lab8.DAO.ProductDAO;
import Lab8.DTO.Product;

public class bai3 {
    public static void main(String[] args) {
        Product p1 = new Product("iPhone9", 1000.0);
        Product p2 = new Product("Samsung Start", 3000.0);

        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        dao.store("D://prod.dat");

        ProductDAO dao2 = new ProductDAO();
        dao2.load("D://prod.dat");
        Product p = dao2.find("iPhone9");
        System.out.println(">Name: " + p.getName());
        System.out.println(">Price: " + p.getPrice());
    }
}
