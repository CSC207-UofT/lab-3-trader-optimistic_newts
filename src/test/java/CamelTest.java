import org.junit.*;

import static org.junit.Assert.*;

/**
 * A class that tests the methods in the Camel class.
 */
public class CamelTest {
    Camel c;

    @Before
    public void setUp(){
        c = new Camel();
    }

    /**
     * Test whether Camel returns a camel sound.
     */
    @Test(timeout = 50)
    public void TestCamelSound() {
        assertEquals("BAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", c.sound());
    }

    /**
     * Test if Camel returns the right price.
     */
    @Test(timeout = 50)
    public void TestCamelGetPrice(){
        assertEquals(100, c.getPrice());
    }

    /**
     * Test if Camel returns the right speed.
     */
    @Test(timeout = 50)
    public void TestCamelGetSpeed(){
        assertEquals(10, c.getMaxSpeed());
    }

    /**
     * Test if Camel returns the right speed after upgrading.
     */
    @Test(timeout = 50)
    public void TestCamelUpgradeSpeed(){
        c.upgradeSpeed();
        assertEquals(11, c.getMaxSpeed());
    }

    /**
     * Test if Camel returns the right speed after downgrading.
     */
    @Test(timeout = 50)
    public void TestCamelDowngradeSpeed(){
        c.downgradeSpeed();
        assertEquals(10, c.getMaxSpeed());
    }
}
