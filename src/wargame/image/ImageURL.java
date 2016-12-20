package wargame.image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import wargame.util.Log;

/**
 *
 * @author Hugo Sartori
 */
public class ImageURL {
    
    private static ImageURL instance;
    
    private ImageURL() {
        
    }
    
    public URL getImageUrl(String imageName) {
        
        Log.put("IMAGE", getClass().getResource(imageName).toString());
        return getClass().getResource(imageName);
        
    }
    
    public static ImageURL newInstance() {
        if (instance == null) instance = new ImageURL();
        return instance;
    }
    
    public static ImageURL getInstance() {
        return newInstance();
    }
    
}
