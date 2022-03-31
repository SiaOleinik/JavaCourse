package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(0, false, warehouse1);
        Picker picker1 = new Picker(0, false, warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println("All picked orders " + warehouse1.countPickedOrders);
        System.out.println("All delivered orders " + warehouse1.countDeliveredOrders);
        System.out.println("Courier earned " + courier1.getSalary());
        System.out.println("Picker earned " + picker1.getSalary());
        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(0, false, warehouse2);
        Picker picker2 = new Picker(0, false, warehouse2);
        courier2.doWork();
        picker2.doWork();

        picker1.toString();
        courier1.toString();
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
