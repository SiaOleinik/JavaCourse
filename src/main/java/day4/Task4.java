package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] line = new int[100];
        Random ran = new Random();
        int sum = 0;
        int maxSum = 0;
        int indMaxSum = 0;

        for (int i = 0; i < line.length; i++) {
            line[i] = ran.nextInt(10001);
        }

        for (int i = 0; i < line.length - 2; i++) {
            sum = line[i] + line[i + 1] + line[i + 2];

            if (sum > maxSum) {
                maxSum = sum;
                indMaxSum = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(indMaxSum);


    }
}
