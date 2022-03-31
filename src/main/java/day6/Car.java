package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    void info(){
        System.out.println("This is car");
    }

    int yearDifference(int inputYear){
        int difference = inputYear - year;
        if(difference < 0){
            difference = - difference;
        }
        System.out.println(difference);
        return difference;
    }
}
