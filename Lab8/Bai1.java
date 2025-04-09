package Lab8;

import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2.5);
        arrayList.add(true);
        arrayList.add("Hoàng Nguyên");

        System.out.println("In ra dữ liệu...");
        arrayList.forEach(System.out::println);
    }
}
