import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorcycleTest {
    Motorcycle m;

    @Before
    public void setUp() throws Exception {
        m = new Motorcycle();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, m.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        m.upgradeSpeed();
        assertEquals(6, m.getMaxSpeed());
        assertEquals(1060, m.getPrice());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        m.downgradeSpeed();
        assertEquals(4, m.getMaxSpeed());
        assertEquals(960, m.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, m.getPrice());
    }

}

