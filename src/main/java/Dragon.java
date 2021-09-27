public class Dragon implements Domesticatable, Tradable{

    public Dragon() {
    }


    /**
     *
     * @return  A dragon sound.
     */
    @Override
    public String sound() {
        return "grrrr (with fire)";
    }

    /**
     *
     * @return  The price of a dragon.
     */
    @Override
    public int getPrice() {
        return 1000;
    }
}
