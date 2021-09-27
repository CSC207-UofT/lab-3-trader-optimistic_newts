public class Dog implements Domesticatable, Tradable{

    /**
     * Return the sound made by a dog.
     *
     * @return    A doggy woof.
     **/
    @Override
    public String sound() {
        return "Woof";
    }

    /**
     * Return the price of a dog.
     *
     * @return    The price of a dog.
     **/
    @Override
    public int getPrice() {
        return 5;
    }
}
