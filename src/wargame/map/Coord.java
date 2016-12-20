/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.map;

/**
 *
 * @author Hugo Sartori
 */
public class Coord {
    
    public int x, y;
    
    public Coord(int x, int y) {
        if (x >= 0 && x <= 4)
            this.x = x;
        else
            throw new IllegalArgumentException("EXCEPTION: x must assume values betwen 0 and 4 ");
        
        if (y >= 0 && y <= 7)
            this.y = y;
        else
            throw new IllegalArgumentException("EXCEPTION: y must assume values betwen 0 and 4 ");
        
    }
    
    public Coord getSide(Side side) {
        if (side == Side.UP) 
            if (y + 1 <= 7) return new Coord(x, y + 1);
            else            return null;
        if (side == Side.DOWN) 
            if (y - 1 >= 0) return new Coord(x, y - 1);
            else            return null;
        if (side == Side.RIGHT) 
            if (x + 1 <= 5) return new Coord(x + 1, y);
            else            return null;
        if (side == Side.LEFT) 
            if (x - 1 >= 0) return new Coord(x - 1, y);
            else            return null;
        
        return null;
    }
    
    public enum Side {
        UP, DOWN, RIGHT, LEFT;
    }
}

