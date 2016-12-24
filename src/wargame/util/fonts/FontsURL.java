package wargame.util.fonts;

import java.net.URL;

/** @author Hugo Sartori */
public class FontsURL {

    private static FontsURL instance = null;
    
    public static final int PERFECT_DARK = 0;
    
    public static URL getFontURL(String name) {
        return newInstance().getClass().getResource(name);
    }
    
    public static URL getFontURL(int font) {
        switch(font) {
            case PERFECT_DARK:
                return newInstance().getClass().getResource("pdark.ttf");
            default:
                return null;
        }
    }
    
    public static FontsURL newInstance() {
        if (instance == null) instance = new FontsURL();
        return instance;
    }
    
}
