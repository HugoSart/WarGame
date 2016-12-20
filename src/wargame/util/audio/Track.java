/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.util.audio;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import wargame.util.Log;
import wargame.util.audio.songs.MediaURL;

/**
 *
 * @author Hugo Sartori
 */
public class Track {

    Media media;
    MediaPlayer mp;
    MediaURL mu;

    public Track(String songName) {
        try {
            mu = new MediaURL();
            media = new Media(mu.getMediaUrl(songName).toString());
            mp = new MediaPlayer(media);
            initSettings();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        mp.play();
    }

    public void stop() {
        mp.stop();
    }

    public void update() {
        initSettings();
    }

    protected void initSettings() {
        mp.setMute(!(AudioControler.isMusicAudio() && AudioControler.isGeneralAudio()));
        mp.setVolume(AudioControler.getMusicVolume()*AudioControler.getGeneralVolume());
    }

}
