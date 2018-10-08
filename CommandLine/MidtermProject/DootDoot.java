package MidtermProject;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;
import java.util.Scanner;

/**
 * The main class of the package. Asks for a songNumber input from the
 * user and plays that corresponding song from SongList.java
 */
public class DootDoot extends HummingbirdRobot {
    public static void main(String[] args) throws InterruptedException {
        HummingbirdRobot doot = new HummingbirdRobot();
        Scanner s = new Scanner(System.in);

        System.out.println("doot doot...this is the Skeleton Jukebox!");
        System.out.println("Pick a song to start!");
        System.out.println("1: Test audio clip\n" +
                "2: Careless Whisper Romantic Instrumental\n" +
                "3: Darude - Sandstorm for Brass Quintet\n" +
                "4: Megalovania Undertale Trombone Quartet\n" +
                "5: Mii Channel Theme Sax Quartet\n" +
                "6: Queen - Don't Stop Me Now Trombone Quartet\n" +
                "7: Trumpet - I Want It That Way - Backstreet Boys\n" +
                "8: Vitas - The 7th Element for Brass Quintet");
        int songNumberInput = s.nextInt();

        //TODO: Wake me up inside
        //TODO: Special Megalovania lights
        if(songNumberInput < 1) {
            System.out.print("That's not the right output!");
            //TODO: Play a spooky audio clip here
        } else {
            System.out.print("Now playing: " + SongList.getSong(songNumberInput));
            doot.playClip(PlaySound.sound(SongList.getSong(songNumberInput)));
            //I assume each byte in the array takes a ms to process...so it'll Thread.sleep for that amount of bytes
            Thread.sleep(PlaySound.sound(SongList.getSong(songNumberInput)).length);
        }

        doot.disconnect();
    }
}
