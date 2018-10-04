//Import the Hummingbird library
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

//Extend the Hummingbird Robot class
//If we want to pause execution with Thread.sleep() we need to handle an exception
public class Robot1 extends HummingbirdRobot {
    //Create a main method
    public static void main(String[] args) throws InterruptedException {
        //Create a hummingbird object
        HummingbirdRobot bot = new HummingbirdRobot();

        //Turn on the single color LED
        bot.setLED(1, 200);

        //Sleep 1 second then turn off the LED
        Thread.sleep(3000);
        bot.setLED(1, 0);

        //Turn on the RGB LED and turns it off
        bot.setFullColorLED(1, 0, 0, 255);
        Thread.sleep(3000);

        //Randomly changes the color of the LED
        for (int i=0; i<50; i++) {
            bot.setFullColorLED(1,
                    (int) (Math.random() * 255),  //Red
                    (int) (Math.random() * 255),  //Green
                    (int) (Math.random() * 255)); //Blue
            Thread.sleep(200);

        }

        //Always disconnect from the robot at the end of the program
        bot.disconnect();
    }
}
