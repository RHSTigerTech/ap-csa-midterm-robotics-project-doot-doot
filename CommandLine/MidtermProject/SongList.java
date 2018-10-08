package MidtermProject;

/**
 * Initializes a list of directories and calls them based on a parameter.
 * The songNumber will be called in DootDoot.
 */
public class SongList {
    public static String getSong(int songNumber) {
        String[] songList = {
                "H:\\APCSA2018\\HummingbirdJava\\CommandLine\\MidtermProject\\Audio\\soundfile.wav"
        };
        return songList[songNumber-1];
    }
}
