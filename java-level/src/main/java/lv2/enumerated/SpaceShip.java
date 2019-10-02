package lv2.enumerated;

/**
 * @author boyiren
 * @date 2019-10-02
 */
public enum SpaceShip {
    /**
     * Scout
     */
    SCOUT,
    /**
     * Cargo
     */
    CARGO,
    /**
     * Transport
     */
    TRANSPORT,
    /**
     * Cruiser
     */
    CRUISER,
    /**
     * Battleship
     */
    BATTLESHIP,
    /**
     * Mothership
     */
    MOTHERSHIP;
    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip spaceShip : values()) {
            System.out.println(spaceShip);
        }
    }
}
