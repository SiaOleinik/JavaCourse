package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(100, 0.8, 0, 30);
        Paladin paladin = new Paladin(100, 0.5, 0.2, 15);
        Magician magician = new Magician(100, 0.0, 0.8, 5, 20);
        Shaman shaman = new Shaman(100, 0.2, 0.2, 10, 15);

        warrior.physicalAttack(paladin);
        System.out.println(paladin.toString());
        paladin.physicalAttack(magician);
        System.out.println(magician.toString());
        shaman.healTeammate(magician);
        System.out.println(magician.toString());
        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());
        paladin.healHimself();
        System.out.println(paladin.toString());
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician.toString());
        }

    }
}
