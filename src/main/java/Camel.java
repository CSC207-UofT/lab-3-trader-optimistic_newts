/**
 * A class representing a Camel.
 */
public class Camel implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Camel() {
        this.maxSpeed = 10;
    }

    /**
     * Returns the sound a camel makes. For reference: https://www.youtube.com/watch?v=5GpMGiDmbdM
     * @return A string representing a Camel sound.
     */
    @Override
    public String sound() {
        return "BAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!";
    }

    /**
     * Upgrades the speed of the Camel.
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    /**
     * Downgrades the speed of the Camel.
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    /**
     * Gets the max speed of the Camel.
     * @return An int representing the max speed of the Camel.
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Gets the price of the Camel.
     * @return An int representing the price of the Camel.
     */
    @Override
    public int getPrice() {
        return 100;
    }

    /**
     * Overrides the toString method to return a string containing the max speed of the Camel.
     * @return A string with details about the max speed of the Camel.
     */
    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
