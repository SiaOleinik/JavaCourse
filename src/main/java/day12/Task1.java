package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Volkswagen");
        cars.add("Volvo");

        System.out.println(cars);

        cars.add(3, "Lexus");
        cars.remove(0);
        System.out.println(cars);

    }
}
