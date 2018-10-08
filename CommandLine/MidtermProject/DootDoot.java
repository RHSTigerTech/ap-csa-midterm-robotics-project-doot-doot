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
        System.out.println("1 - Test audio clip");
        int songNumberInput = s.nextInt();

        //TODO: Wake me up inside
        //TODO: Special Megalovania lights
        if(songNumberInput < 1) {
            System.out.println("That's not the right output!");
            //TODO: Play a spooky audio clip here
        } else {
            doot.playClip(PlaySound.sound(SongList.getSong(songNumberInput)));
            //I assume each byte in the array takes a ms to process...so it'll Thread.sleep for that amount of bytes
            Thread.sleep(PlaySound.sound(SongList.getSong(songNumberInput)).length);
        }

        doot.disconnect();
    }
}
