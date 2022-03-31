package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int moreThan8 = 0;
        int equals1 = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int sumNumber = 0;

        for (int number : numbers) {
            number = random.nextInt(11);
            System.out.print(number+" ");


            if (number > 8) {
                moreThan8++;
            }
            if (number == 1) {
                equals1++;
            }
            if (number % 2 == 0) {
                sumOfEven++;
            }
            if (number % 2 != 0) {
                sumOfOdd++;
            }
            sumNumber += number;
        }

        System.out.println();
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + moreThan8);
        System.out.println("Количество чисел равных 1: " + equals1);
        System.out.println("Количество четных чисел: " + sumOfEven);
        System.out.println("Количество нечетных чисел: " + sumOfOdd);
        System.out.println("Сумма всех элементов массива: " + sumNumber);

    }
}
