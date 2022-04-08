package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;


    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>();
    }

    public int getYear() {
        return year;
    }
    public List<MusicArtist> getMembers() {
        return members;
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(MusicBand mbA, MusicBand mbB){

        for (MusicArtist member: mbA.members ) {
            mbB.members.add(member);

        }

        mbA.members.clear();

    }

    public void printMembers(MusicBand mbA){
        System.out.println(this.members);

    }

}
