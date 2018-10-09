package MidtermProject;

/**
 * Initializes a list of directories and calls a song based on a parameter.
 * The songNumber will be called in DootDoot.java.
 */
public class SongList {
    public static String getSong(int songNumber) {
        String[] songList = {
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //1
                        "\\soundfile.wav",
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //2
                        "\\careless whisper romantic instrumental.mp4.wav",
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //3
                        "\\Darude - Sandstorm for Brass Quintet.wav",
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //4
                        "\\Megalovania Undertale Trombone Quartet.wav",
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //5
                        "\\Mii Channel Theme Sax Quartet.wav",
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //6
                        "\\Queen - Don't Stop Me Now Trombone Arrangement.wav",
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //7
                        "\\Trumpet - I Want It That Way - Backstreet Boys Sheet Music, Chords, & Vocals.wav",
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //8
                        "\\Vitas - The 7th Element for Brass Quintet.wav",
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio" + //9
                        "\\All Star for Trumpet, Tenor Sax, and Trombone.wav"
        };

        return songList[songNumber-1];
    }
}
