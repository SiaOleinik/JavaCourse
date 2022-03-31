package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("B", 2013, 826,952,0);
        Airplane airplane2 = new Airplane("B", 2013, 530,850,0);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}