import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Song s = new Song();
        s.setName("Tsigereda");
        s.setAlbum("Ethiopian");
        s.setArtist("Mia");
        s.setRating(100);
        s.setYear(29);


//        System.out.printf("The song name was %s\n", s.getName());
//        //the %s is used to formate the result
//        System.out.printf("The artist name is %s\n", s.getArtist());
//        System.out.printf("The albem name is %s\n", s.getAlbum());
//        System.out.printf("The rating was %s and the year it came out was %s\n",s.getRating());
        ArrayList<Song> newSong = new ArrayList<>();
        newSong.add(s);
        System.out.println( s.getName());
        //the %s is used to formate the result
        System.out.println( s.getArtist());
        System.out.println( s.getAlbum());
        System.out.println(s.getRating());
        System.out.println(s.getYear());


        Song s2 =new Song();
        s2.setName("Affa");
        s2.setAlbum("Falling in to grace");
        s2.setArtist("Sabnachi");
        s2.setRating(100);
        s2.setYear(57);


        ArrayList<Song> song2 = new ArrayList<>();
        song2.add(s2);
        System.out.println( s2.getName());
        //the %s is used to formate the result
        System.out.println( s2.getArtist());
        System.out.println( s2.getAlbum());
        System.out.println(s2.getRating());
        System.out.println(s2.getYear());
//        for (Song oneSong:newSong){
//            System.out.printf("The artist is %s and the album is %s\n",oneSong.getArtist());
//        }

    }
}

