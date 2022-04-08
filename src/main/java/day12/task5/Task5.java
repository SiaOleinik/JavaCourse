package day12.task5;

import day12.task4.MusicBand;

public class Task5 {
    public static void main(String[] args) {
        day12.task4.MusicBand mbA = new day12.task4.MusicBand("Blur", 1990);
        day12.task4.MusicBand mbB = new day12.task4.MusicBand("Nirvana", 1992);

        mbA.getMembers().add("Benjamin Franklin");
        mbA.getMembers().add("George Washington");
        mbA.getMembers().add("Abraham Lincoln");

        mbB.getMembers().add("Theodor Roosvelt");
        mbB.getMembers().add("John Kennedy");
        mbB.getMembers().add("Barry Obama");

        MusicBand.transferMembers(mbA, mbB);

        mbA.printMembers(mbA);
        mbB.printMembers(mbB);


    }
}
