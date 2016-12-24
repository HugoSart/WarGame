package wargame.gameplay;

import java.util.Random;
import wargame.gameplay.map.Continent;
import wargame.gameplay.map.Coord;
import wargame.gameplay.map.Map;
import wargame.gameplay.map.Territory;
import wargame.gameplay.player.Player;

public class Gameplay {

    public Map map;

    Player p1, p2;

    public Gameplay(Player p1, Player p2) {
        map = new Map();
        this.p1 = p1;
        this.p2 = p2;
    }

    public void distributeTerritories() {

        Coord coord = new Coord(0, 0);

        for (coord.y = 0; coord.y < map.getLength(); coord.y++) {
            for (coord.x = 0; coord.x < map.getHeight(); coord.x++) {

                if (map.getTerritory(coord) != null && map.getTerritory(coord).getContinent() == Continent.OCEAN) {
                    coord.x++;
                } else if (map.getTerritory(coord) != null) {
                
                    if ((new Random()).nextInt(2) == 0) {
                        map.getTerritory(coord).setColor(p1.getColor());
                    } else {
                        map.getTerritory(coord).setColor(p2.getColor());
                    }
                    
                }
            }
        }

    }

}
