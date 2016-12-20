/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.util.audio;

import java.net.URL;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.naming.Context;
import wargame.util.Log;
import wargame.util.Resources;

/**
 *
 * @author hugovs
 */
public abstract class AudioControler {

    private static boolean generalAudio = true;
    private static boolean musicAudio = true;
    private static boolean effectAudio = true;
    
    private static double generalVolume = 1.0;
    private static double musicVolume = 1.0;
    private static double effectVolume = 1.0;
    
    public static boolean isGeneralAudio() {
        return generalAudio;
    }

    public static void setGeneralAudio(boolean generalAudio) {
        AudioControler.generalAudio = generalAudio;
    }

    public static boolean isMusicAudio() {
        return musicAudio;
    }

    public static void setMusicAudio(boolean musicAudio) {
        AudioControler.musicAudio = musicAudio;
    }

    public static boolean isEffectAudio() {
        return effectAudio;
    }

    public static void setEffectAudio(boolean effectAudio) {
        AudioControler.effectAudio = effectAudio;
    }

    public static double getGeneralVolume() {
        return generalVolume;
    }

    public static void setGeneralVolume(double generalVolume) {
        AudioControler.generalVolume = generalVolume;
    }

    public static double getMusicVolume() {
        return musicVolume;
    }

    public static void setMusicVolume(double musicVolume) {
        AudioControler.musicVolume = musicVolume;
    }

    public static double getEffectVolume() {
        return effectVolume;
    }

    public static void setEffectVolume(double effectVolume) {
        AudioControler.effectVolume = effectVolume;
    }

}
