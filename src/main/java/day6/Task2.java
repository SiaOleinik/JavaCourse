package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2018, 52, 852, 0);
        plane.info();
        plane.setYear(2000);
        plane.setLength(950);
        plane.fillUp(52);
        plane.info();
        plane.fillUp(100);
        plane.info();

    }
}
