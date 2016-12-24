/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.util;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.net.URL;
import javax.naming.Context;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import wargame.util.image.ImageURL;

/**
 *
 * @author hugovs
 */
public class Resources {
    
    public URL getMainSong() {
        return getClass().getResource("/songs/main_song.mp3");
    }
   
    
}
