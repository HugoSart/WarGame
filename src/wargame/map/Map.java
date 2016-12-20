/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.map;

import java.util.ArrayList;

/**
 *
 * @author Hugo Sartori
 */
public class Map {
    
    private final Territory[][] map;
    
    public Map() {
        
        map = new Territory[5][8];
        
        map[0][0] = new Territory(Continent.NORTH_AMERICA, "ALASCA");
        map[0][1] = new Territory(Continent.NORTH_AMERICA, "VANCOUVER");
        map[0][2] = new Territory(Continent.NORTH_AMERICA, "GROELAND");
        map[1][1] = new Territory(Continent.NORTH_AMERICA, "CALIFORN");
        map[1][2] = new Territory(Continent.NORTH_AMERICA, "OTAWA");
        map[2][1] = new Territory(Continent.NORTH_AMERICA, "MEXICO");
        map[2][2] = new Territory(Continent.NORTH_AMERICA, "NEW YORK");
        
        map[0][3] = new Territory(Continent.EUROPE, "ENGLAND");
        map[0][4] = new Territory(Continent.EUROPE, "ITALY");
        map[0][5] = new Territory(Continent.EUROPE, "SWEDEN");
        map[1][4] = new Territory(Continent.EUROPE, "GERMANY");
        map[1][5] = new Territory(Continent.EUROPE, "MOSCOW");
        
        map[0][7] = new Territory(Continent.ASIA, "VLADIVOSTOK");
        map[1][6] = new Territory(Continent.ASIA, "OMSK");
        map[1][7] = new Territory(Continent.ASIA, "SIBERY");
        map[2][5] = new Territory(Continent.ASIA, "MIDDLE EAST");
        map[2][6] = new Territory(Continent.ASIA, "INDIA");
        map[2][7] = new Territory(Continent.ASIA, "CHINA");
        map[3][7] = new Territory(Continent.ASIA, "JAPAN");
        
        map[3][0] = new Territory(Continent.SOUTH_AMERICA, "CHILE");
        map[3][1] = new Territory(Continent.SOUTH_AMERICA, "COLOMBIA");
        map[4][0] = new Territory(Continent.SOUTH_AMERICA, "ARGENTINA");
        map[4][1] = new Territory(Continent.SOUTH_AMERICA, "BRAZIL");
        
        map[2][3] = new Territory(Continent.AFRICA, "NIGERIA");
        map[2][4] = new Territory(Continent.AFRICA, "EGYPT");
        map[3][3] = new Territory(Continent.AFRICA, "CONGO");
        map[3][4] = new Territory(Continent.AFRICA, "SUDAN");
        map[4][3] = new Territory(Continent.AFRICA, "SOUTH AFRICA");
        map[4][4] = new Territory(Continent.AFRICA, "MADAGASCAR");
        
        map[3][5] = new Territory(Continent.OCEANIA, "SUMATRA");
        map[3][6] = new Territory(Continent.OCEANIA, "BORNEU");
        map[4][6] = new Territory(Continent.OCEANIA, "AUSTRALIA");
        map[4][7] = new Territory(Continent.OCEANIA, "NEW GUINERA");
        
        map[0][6] = new Territory(Continent.OCEAN, "OCEAN");
        map[1][0] = new Territory(Continent.OCEAN, "OCEAN");
        map[1][3] = new Territory(Continent.OCEAN, "OCEAN");
        map[2][0] = new Territory(Continent.OCEAN, "OCEAN");
        map[3][2] = new Territory(Continent.OCEAN, "OCEAN");
        map[4][2] = new Territory(Continent.OCEAN, "OCEAN");
        map[4][5] = new Territory(Continent.OCEAN, "OCEAN");
        
    }
    
    public Territory getTerritory(String name) {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (map[x][y].getName().equals(name))
                    return map[x][y];
            }
        }
        return null;
    }
    
    public Territory getTerritory(Coord c) {
        if (c.x > 7 || c.y > 4) return null;
        
        return map[c.x][c.y];
    }
    
    public Coord getTerritoryCoord(String name) {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (map[x][y].getName().equals(name))
                    return new Coord(x,y);
            }
        }
        return null;
    }
    
    public Coord getTerritoryCoord(Territory territory) {
        return getTerritoryCoord(territory.getName());
    }
    
    public ArrayList<Territory> getTerritoriesInBorderOf(Territory territory) {
        
        ArrayList<Territory> list = new ArrayList<>();
        
        Coord coord = getTerritoryCoord(territory);
        
        if (coord.getSide(Coord.Side.UP)    != null)    list.add(getTerritory(coord.getSide(Coord.Side.UP)));
        if (coord.getSide(Coord.Side.DOWN)  != null)    list.add(getTerritory(coord.getSide(Coord.Side.DOWN)));
        if (coord.getSide(Coord.Side.RIGHT) != null)    list.add(getTerritory(coord.getSide(Coord.Side.RIGHT)));
        if (coord.getSide(Coord.Side.LEFT)  != null)    list.add(getTerritory(coord.getSide(Coord.Side.LEFT)));
    
        return list;
        
    }
    
    public int getLength() {
        return 8;
    }
    
    public int getHeight() {
        return 5;
    }
    
}
