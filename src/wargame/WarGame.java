package wargame;

import javafx.embed.swing.JFXPanel;
import wargame.gui.StartScreen;
import wargame.util.Utilities;
import wargame.util.audio.AudioControler;
import wargame.util.audio.Track;


/** @author hugovs **/
public class WarGame {

    public static Track mainMusic;
    
    public static void main(String[] args) {
        initialConfig();
        StartScreen startScreen = StartScreen.newInstance(true);
        
    }
    
    private static void initialConfig() {
        Utilities.startJavaFXToolkit(); // start javafx toolkit
        Utilities.setLookAndFeel("Windows");
        mainMusic = new Track("main_song.mp3");
        mainMusic.play();
    }
    
}
