/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.util.audio.songs;

import java.net.URL;

/**
 *
 * @author Hugo Sartori
 */
public class MediaURL {
    
    public URL getMediaUrl(String songName) {
        return getClass().getResource(songName);
    }
    
}
