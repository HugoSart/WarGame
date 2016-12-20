package wargame.map;

import java.awt.Color;
import java.util.ArrayList;

/** @author Hugo Sartori */
public class Territory {
    
    ArrayList<Territory> borderList;
    
    private final Continent continent;
    private final String name;
    private Color color = Color.WHITE;
    
    public Territory(Continent continent, String name) {
        this.continent = continent;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public Continent getContinent() {
        return continent;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
}
