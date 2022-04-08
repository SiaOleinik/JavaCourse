package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Кино", 1980);
        MusicBand mb2 = new MusicBand("Аквавриум", 1972);
        MusicBand mb3 = new MusicBand("Linkin park", 1996);
        MusicBand mb4 = new MusicBand("Крематорий", 1983);
        MusicBand mb5 = new MusicBand("Green day", 1987);
        MusicBand mb6 = new MusicBand("Cream soda", 2012);
        MusicBand mb7 = new MusicBand("Guns N' Roses", 1985);
        MusicBand mb8 = new MusicBand("Sade", 1984);
        MusicBand mb9 = new MusicBand("SomeBand", 2008);
        MusicBand mb10 = new MusicBand("SomeAnotherBand", 2010);

        /*Array*/
        List<MusicBand> myListMB = new ArrayList<>();
        myListMB.add(mb1);
        myListMB.add(mb2);
        myListMB.add(mb3);
        myListMB.add(mb4);
        myListMB.add(mb5);
        myListMB.add(mb6);
        myListMB.add(mb7);
        myListMB.add(mb8);
        myListMB.add(mb9);
        myListMB.add(mb10);

        System.out.println(myListMB.toString());

        Collections.shuffle(myListMB);
        System.out.println(myListMB.toString());
        System.out.println(groupsAfter2000(myListMB));

    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> myListMB) {
        List<MusicBand> listAfter2000 = new ArrayList<>();
        for (MusicBand band : myListMB) {

            if (band.getYear() > 2000) {
                listAfter2000.add(band);

            }

        }

        return listAfter2000;
    }


}
