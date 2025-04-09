package Lab8;

import Extension.Input;

import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(10);
        for (int i = 0; i < 10; i++)
            integers.add(Input.intInput("Nhập: "));

        integers.forEach(System.out::println);
    }
}
