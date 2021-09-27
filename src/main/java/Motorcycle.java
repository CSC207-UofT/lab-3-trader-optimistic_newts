public class Motorcycle implements Drivable, Tradable {
    private int maxSpeed = 5;
    private int Price;


    public Motorcycle() {
        this.Price = 1000;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
        this.Price += this.maxSpeed * 10;
    }

    @Override
    public void downgradeSpeed() {
        if (maxSpeed > 0) {
            this.maxSpeed--;
            this.Price -= this.maxSpeed * 10;
        }
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.Price;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";

    }
}
