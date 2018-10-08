package MidtermProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PlaySound {
    public static byte[] sound(String soundFile) {
        return fileToByte(soundFile);
    }

    //Returns the audio file path to a byte array
    public static byte[] fileToByte(String fileInput) {
        //Creates a File object containing the audio directory
        File input = new File(fileInput);
        //Initializes the byte[] object with input's file size
        byte[] bytesArray = new byte[(int) input.length()];
        //This didn't work at first until it was in a try-catch
        try {
            FileInputStream stream = new FileInputStream(input);
            //FileInputStream.read() is, in fact, not ignored
            stream.read(bytesArray); //Read file into bytes[]
            stream.close();
        } catch (IOException e) {
            System.out.println("1");
            System.out.println(e);
        }

        return bytesArray;
    }
}
