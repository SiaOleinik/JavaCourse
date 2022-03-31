package day11.task1;

public class Courier implements Worker {
    protected int salary;
    protected boolean isPayed;
    Warehouse warehouse;

    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
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
        salary += 100;
        warehouse.countDeliveredOrders++;


    }

    @Override
    public int bonus() {
        if (warehouse.countDeliveredOrders > 10000) {
            System.out.println("Bonus has already been paid.");
        } else if (warehouse.countDeliveredOrders < 10000) {
            System.out.println("Bonus is not available yet.");
        } else if (warehouse.countPickedOrders == 10000) {
            isPayed = true;
            salary += 50000;
        }
        return getSalary();
    }
}
