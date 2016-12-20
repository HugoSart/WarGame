package wargame.widgets;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JButton;
import wargame.WarGame;
import wargame.util.Log;
import wargame.util.audio.Effect;
import wargame.util.audio.Track;
import wargame.util.audio.songs.MediaURL;

/**
 * @author Hugo Sartori
 */
public class WButton extends JButton implements java.awt.event.MouseListener {

    private Color colorMouseOver = Color.decode("#4838e0");
    private String mouseOverMediaName = "menu_mouse_over.wav/";
    private String mouseClickMediaName = "menu_mouse_over.wav/";
    private Color colorMouseOverPost;

    public WButton() {
           
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);

        addMouseListener(this);   
    }

    private boolean playEffectSound(String inOut) {
        if (isEnabled()) {
            try {
                Effect effect = new Effect(inOut);
                effect.play();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="MouseListener implementations">
    @Override
    public void mouseClicked(MouseEvent e) {
        playEffectSound(mouseClickMediaName);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setForeground(colorMouseOver);
        playEffectSound(mouseOverMediaName);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(colorMouseOverPost);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters and Getters">
    public void setColorMouseOver(Color color) {
        this.colorMouseOver = color;
    }

    public Color getColorMouseOver() {
        return colorMouseOver;
    }

    public String getMouseOverMediaName() {
        return mouseOverMediaName;
    }

    public void setMouseOverMediaName(String mouseOverMediaName) {
        this.mouseOverMediaName = mouseOverMediaName;
    }

    public String getMouseClickMediaName() {
        return mouseClickMediaName;
    }

    public void setMouseClickMediaName(String mouseClickMediaName) {
        this.mouseClickMediaName = mouseClickMediaName;
    }
    
    public Color getColorMouseOverPost() {
        return colorMouseOverPost;
    }
    
    public void setColorMouseOverPost(Color color) {
        this.colorMouseOverPost = color;
    }
    // </editor-fold>

}
