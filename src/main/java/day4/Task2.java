package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers100 = new int[100];
        Random ran = new Random();
        int sum0 = 0;
        int quantity0 = 0;
        int max = 0;
        int min = 0;

        for (int i = 0; i < numbers100.length; i++) {
            numbers100[i] = ran.nextInt(10001);
            min = numbers100[0];
        }

        for (int number : numbers100) {
            System.out.print(number + " ");

            if (number % 10 == 0) {
                quantity0++;
                sum0 += number;
            }

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }

        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
        System.out.println(quantity0);
        System.out.println(sum0);

    }
}
