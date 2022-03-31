package day8;

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

    public Airplane(String manufacturer, int year, double length, double weight){
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
    public String toString(){
       return "Изготовитель: " + manufacturer +" , год выпуска: "+year+ " , длина: " + length + " , вес: " + weight;

    }

}





