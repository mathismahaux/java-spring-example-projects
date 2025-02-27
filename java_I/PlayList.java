import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
  public static void main(String[] args) {
    String[] favoriteSongs = {"Queen - Bohemian Rhapsody", "ACDC - Thunderstruck", "Queen - We Will Rock You", "Psy - Gangam Style", "Bruno Mars - Uptown Funk", "Pharrell Williams - Happy", "Adam Sandler - At A Medium Pace", "Eiffel95 - I'm Blue", "The Foo Fighters - The Pretender", "Johnny Hallyday - Allumer Le Feu"};
    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2]);

    System.out.println("----------------------------");

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Wankil Studio - En Mémoire De Grim");
    desertIslandPlaylist.add("Psy - That That");
    desertIslandPlaylist.add("Deep Purple - Smoke On The Water");
    desertIslandPlaylist.add("ACDC - Back In Black");
    desertIslandPlaylist.add("Survivor - Eye Of The Tiger");
    System.out.println(desertIslandPlaylist);

    System.out.println("----------------------------");

    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
    System.out.println(desertIslandPlaylist);

    System.out.println("----------------------------");

    System.out.println(desertIslandPlaylist.size());

    System.out.println("----------------------------");

    desertIslandPlaylist.remove("Adam Sandler - At A Medium Pace");
    desertIslandPlaylist.remove("Wankil Studio - En Mémoire De Grim");
    desertIslandPlaylist.remove("Psy - That That");
    desertIslandPlaylist.remove("Queen - Bohemian Rhapsody");
    desertIslandPlaylist.remove("Deep Purple - Smoke On The Water");
    desertIslandPlaylist.remove("Eiffel95 - I'm Blue");
    desertIslandPlaylist.remove("Johnny Hallyday - Allumer Le Feu");
    desertIslandPlaylist.remove("Survivor - Eye Of The Tiger");
    desertIslandPlaylist.remove("Pharrell Williams - Happy");
    desertIslandPlaylist.remove("Queen - We Will Rock You");

    System.out.println(desertIslandPlaylist);      System.out.println(desertIslandPlaylist.size());

    System.out.println("----------------------------");

    int songA = desertIslandPlaylist.indexOf("ACDC - Thunderstruck");
    int songB = desertIslandPlaylist.indexOf("The Foo Fighters - The Pretender");

    String tempA = desertIslandPlaylist.get(songA);
    desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
    desertIslandPlaylist.set(songB, tempA);

    System.out.println(desertIslandPlaylist);
  }
  
}