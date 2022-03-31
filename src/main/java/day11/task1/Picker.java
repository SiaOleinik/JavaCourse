package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        System.out.println("Salary is " + getSalary());
        System.out.println("Bonus is payed " + getIsPayed());
        return null;/*getSalary() +" , "+getIsPayed();*/
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders++;

    }

    @Override
    public int bonus() {
        if (warehouse.countPickedOrders > 10000) {
            System.out.println("Bonus has already been paid.");
        } else if (warehouse.countPickedOrders < 10000) {
            System.out.println("Bonus is not available yet.");
        } else if (warehouse.countPickedOrders == 10000) {
            isPayed = true;
            salary += 70000;
        }
        return getSalary();
    }
}
