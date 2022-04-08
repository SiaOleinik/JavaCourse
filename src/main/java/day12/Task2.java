package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 351; i++) {
            if (i % 2 == 0 && i < 31) {
                evenNumbers.add(i);
            } else if (i % 2 == 0 && i > 299 && i < 351) {
                evenNumbers.add(i);
            } //Так достаточно оригинально? Вложенный цикл это не как два цикла подряд или то же самое?
        }

        System.out.println(evenNumbers);

    }
}
