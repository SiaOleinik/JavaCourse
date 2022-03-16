package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int levels = scanner.nextInt();

        if(levels < 1){
            System.out.println("Ошибка ввода");
        }else if(levels < 5){
            System.out.println("Малоэтажный дом");
        }else if(levels >= 5 && levels < 9){
            System.out.println("Среднеэтажный дом");
        }else{
            System.out.println("Многоэтажный дом");
        }
    }
}
