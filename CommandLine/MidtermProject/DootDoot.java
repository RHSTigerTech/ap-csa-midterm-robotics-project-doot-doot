package MidtermProject;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;
import java.util.Scanner;

public class DootDoot extends HummingbirdRobot {
    public static void main(String[] args) throws InterruptedException {
        HummingbirdRobot doot = new HummingbirdRobot();
        Scanner s = new Scanner(System.in);

        System.out.println("doot doot...this is the Skeleton Jukebox!");
        System.out.println("Pick a song to start!");
        System.out.println("1 - Test audio clip");

        doot.playClip(PlaySound.sound(SongList.getSong(1)));
        //I assume each byte in the array takes a ms to process...so it'll Thread.sleep for that amount of bytes
        Thread.sleep(PlaySound.sound(SongList.getSong(1)).length);

        doot.disconnect();
    }
}
