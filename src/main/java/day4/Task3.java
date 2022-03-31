package day4;


import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        Random ran = new Random();
        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(51);
            }
        }
        int sumMax = 0;
        int indSumMax = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
               // System.out.print(array[i][j] + " ");
            }
            //System.out.println();

            if (sum >= sumMax) {
                sumMax = sum;
                indSumMax = i;
            }

        }
        System.out.println(indSumMax);
    }

}
