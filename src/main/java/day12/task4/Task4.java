package day12.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand mbA = new MusicBand("Blur", 1990);
        MusicBand mbB = new MusicBand("Nirvana", 1992);

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
