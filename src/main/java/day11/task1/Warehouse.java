package day11.task1;

public class Warehouse {
    protected int countPickedOrders;
    protected int countDeliveredOrders;

    public int getCountPickedOrders(){
        return countPickedOrders;
    }

    public int getCountDeliveredOrders(){
        return countDeliveredOrders;
    }

    public String toString(){
        System.out.println("Numbers of picked orders "+getCountPickedOrders());
        System.out.println("Numbers of delivered orders "+getCountDeliveredOrders());
        return null;
    }
}
