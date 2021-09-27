public class Dragon implements Domesticatable, Tradable{

    /** Return the sound of a dragon.
     *
     * @return  A dragon sound.
     */
    @Override
    public String sound() {
        return "grrrr (with fire)";
    }

    /**Return the price of a dragon.
     *
     * @return  The price of a dragon.
     */
    @Override
    public int getPrice() {
        return 1000;
    }
}
