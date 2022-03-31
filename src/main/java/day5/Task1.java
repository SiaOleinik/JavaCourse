package day5;

public class Task1 {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setModel("Explorer");
        ford.setColor("Blue");
        ford.setYear(2018);

        System.out.println(ford.getModel());
        System.out.println(ford.getColor());
        System.out.println(ford.getYear());

    }
}
