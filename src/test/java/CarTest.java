import org.junit.*;
import static org.junit.Assert.*;

public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car();
    }

    @Test(timeout = 50)
    public void upgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(101, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void downgradeSpeed() {
        c.downgradeSpeed();
        assertEquals(99, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void getMaxSpeed() {
        assertEquals(100, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void getPrice() {
        assertEquals(100, c.getPrice());
    }
}
