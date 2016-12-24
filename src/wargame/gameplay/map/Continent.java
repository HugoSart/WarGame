package wargame.gameplay.map;

/** @author Hugo Sartori */
public enum Continent {
    
    AFRICA(0), SOUTH_AMERICA(1), NORTH_AMERICA(2), ASIA(3), EUROPE(4), OCEANIA(5), OCEAN(-1);
    
    int number;
    
    Continent(int number) {
       this.number = number;
    }
    
}
