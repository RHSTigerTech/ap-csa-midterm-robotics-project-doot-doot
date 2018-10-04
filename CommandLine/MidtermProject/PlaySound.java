package MidtermProject;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PlaySound {
    public static byte[] sound(String soundFile) throws IOException {
        return fileToByte(soundFile);
    }

    //Returns the audio file path to a byte array
    public static byte[] fileToByte(String fileInput) throws IOException {
        //Creates a File object containing the audio directory
        File input = new File(fileInput);
        //Initializes the byte[] object with input's file size
        byte[] bytesArray = new byte[(int) input.length()];

        try {
            FileInputStream stream = new FileInputStream(input);
            stream.read(bytesArray); //Read file into bytes[]
            stream.close();
        } catch (IOException e) {
            System.out.println("1");
            System.out.println(e);
        }

        return bytesArray;
    }
}
