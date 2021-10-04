import java.util.HashMap;
import java.util.Set;

public class PlaylistMap{
    public static void main(String[] args) {
        HashMap<String, String> song = new HashMap<String, String>();
        song.put("All Star", "Hey now, your're an allstar!");
        song.put("Your Beautiful", "I saw your face in a crowded place");
        song.put("With You", "I need you Boooo");
        song.put("Never gonna give you up", "Rick Roll'd!");

        System.out.println(song.get("With You")); // print one specific track w lyrics
        //get keys using keySet method
        Set<String> lyrics = song.keySet();
        for(String track : lyrics) {
            System.out.println(track);
            System.out.println(song.get(track));
        }
    }
}