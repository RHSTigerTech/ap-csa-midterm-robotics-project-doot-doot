package MidtermProject;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;
import java.io.IOException;

public class DootDoot extends HummingbirdRobot {
    public static void main(String[] args) throws IOException {
        HummingbirdRobot doot = new HummingbirdRobot();

        System.out.println("doot doot...this is the Skeleton Jukebox!");
        System.out.println("Pick a song to start!");

        doot.playClip(PlaySound.sound("H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio\\soundfile.wav"));
    }
}
