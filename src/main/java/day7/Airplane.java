package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, double length, double weight, int fuel){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }
    public void info(){
        System.out.println("Изготовитель: " + manufacturer +" , год выпуска: "+year+ " , длина: " + length + " , вес: " + weight + " , количество топлива в баке: "+ getFuel());
    }
    public int fillUp(int n){
        fuel +=n;
        return fuel;
    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.length > airplane2.length){
            System.out.println("First airplane is longer");
        }else if(airplane1.length < airplane2.length){
            System.out.println("Second airplane is longer");
        }else{
            System.out.println(" The planes have equals length");
        }
    }
}





