package wargame.player;

import java.awt.Color;

/** @author hugovs */
public class Player {
    
    String nick;
    Color color;
    
    public Player(String nick, Color color) {
        this.nick = nick;
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }
    
}
