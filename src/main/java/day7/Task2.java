package day7;
/* Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random, который будет генерировать случайные числа.
Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно сгенерированные числа от 90 до 100. Вызвать метод info().
При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
*/

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random ran = new Random();

        Player player1 = new Player(ran.nextInt(11) + 90);
        Player player2 = new Player(ran.nextInt(11) + 90);
        Player player3 = new Player(ran.nextInt(11) + 90);
        Player player4 = new Player(ran.nextInt(11) + 90);
        Player player5 = new Player(ran.nextInt(11) + 90);
        Player player6 = new Player(ran.nextInt(11) + 90);

        System.out.println(player2.getStamina());
        System.out.println(player1.getStamina());
        System.out.println(player3.getStamina());
        System.out.println(player4.getStamina());
        System.out.println(player5.getStamina());
        System.out.println(player6.getStamina());
        Player.info();
        Player player7 = new Player(ran.nextInt(11) + 90);
        Player player8 = new Player(ran.nextInt(11) + 90);


        Player.info();
        for (int i = 0; i < 100; i++){
            player6.run(player2);
        }
        Player.info();


    }
}
