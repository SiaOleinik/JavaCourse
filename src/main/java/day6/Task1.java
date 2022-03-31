package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Blue");
        car.setModel("Bjik");
        car.setYear(2002);

        car.info();
        car.yearDifference(2018);
        Motorbike motorbike = new Motorbike("Harley", "Red", 2005);
        motorbike.info();
        motorbike.yearDifference(2000);

    }
}
