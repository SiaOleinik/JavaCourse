package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String string = null;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 20001; i++) {
            string = string + i + " ";
            System.out.print(string);
        }
        long stopTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();System.out.println();

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));


    }
}
