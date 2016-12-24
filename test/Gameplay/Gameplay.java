/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gameplay;

import java.awt.Color;
import java.util.Random;
import wargame.gameplay.map.Continent;
import wargame.gameplay.map.Coord;
import wargame.gameplay.map.Map;
import wargame.gameplay.player.Player;

/**
 *
 * @author Hugo Sartori
 */
public class Gameplay {
    
    public static wargame.gameplay.Gameplay game;
    
    public static void main(String[] args) {
        Player p1 = new Player("xXx_PussyKiller_xXx", Color.RED);
        Player p2 = new Player("BOT Fallen", Color.BLUE);
        
        game = new wargame.gameplay.Gameplay(p1, p2);
        
        game.distributeTerritories();
        
        printMapColors();
        
    }
    
    
    public static void printMapColors() {
        Coord coord = new Coord(0,0);
        for (coord.y = 0; coord.y < game.map.getLength(); coord.y++) {
            System.out.println();
            for (coord.x = 0; coord.x < game.map.getHeight(); coord.x++) {
                System.out.print(game.map.getTerritory(coord).getColor().toString() + " ");
            }
        }
    }
}
