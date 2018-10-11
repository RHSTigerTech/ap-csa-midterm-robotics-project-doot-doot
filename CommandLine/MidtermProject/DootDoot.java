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

        // ledID: 1 - Red (Right eye)
        // RGBledID: 1 (Left eye)
        doot.setLED(1, 200);
        doot.setFullColorLED(2, 200, 0, 0);
        doot.setServoPosition(1, 100);

        //Starting sequence
        System.out.println();
        doot.speak("MY NAME IS DOOT BOX");
        Thread.sleep(3000);
        doot.speak("WHAT IS YOUR NAME?");
        System.out.println("What is your name?");
        String userName = s.nextLine();
        doot.speak("HELLO" + userName + "PICK A SONG TO START");
        System.out.println("HELLO " + userName.toUpperCase() + ", PICK A SONG TO START");

        System.out.println("1: Test audio clip\n" +
                "2: Careless Whisper Romantic Instrumental\n" +
                "3: Darude - Sandstorm for Brass Quintet\n" +
                "4: Megalovania Undertale Trombone Quartet\n" +
                "5: Mii Channel Theme Sax Quartet\n" +
                "6: Queen - Don't Stop Me Now Trombone Quartet\n" +
                "7: Trumpet - I Want It That Way - Backstreet Boys\n" +
                "8: Vitas - The 7th Element for Brass Quintet\n" +
                "9: All Star for Trumpet, Tenor Sax, and Trombone\n" +
                "10: WAKE ME UP INSIDE");

        int songNumberInput = s.nextInt();

        if (songNumberInput < 1 || songNumberInput > 10) {
            System.out.print("That's not the right input!");
            doot.speak("THAT IS NOT A CORRECT INPUT");
        } else {
            if (songNumberInput == 4) {
                //Special Megalovania lights
                doot.setLED(1, 0);
                doot.setFullColorLED(2, 0, 0, 200);
            }
            if (songNumberInput == 10) {
                //Special WAKE ME UP INSIDE lights
                doot.setLED(1, 255);
                doot.setFullColorLED(2, 255,255,255);
            }
            System.out.println("Now playing: " + SongList.getSong(songNumberInput));
            doot.playClip(PlaySound.sound(SongList.getSong(songNumberInput)));
            System.out.println(SongList.getSong(songNumberInput).length());
            //I assume each byte in the array takes a ms to process...so it'll Thread.sleep for that amount of bytes
            for (int i = 0; i < SongList.getSong(songNumberInput).length(); i++) {
                doot.setServoPosition(1, 150);
                Thread.sleep(( -1 * doot.getSensorValue(1)) + 550);
                doot.setServoPosition(1, 100);
                Thread.sleep(( -1 * doot.getSensorValue(1)) + 550);
            }
            Thread.sleep(PlaySound.sound(SongList.getSong(songNumberInput)).length);
        }

        doot.setLED(1, 0);
        doot.setFullColorLED(2, 0, 0,0);
        doot.disconnect();
    }
}
