/*
 * This file contains sample JUnit test cases for Ostrich.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class OstrichTest {
    Ostrich O;

    @Before
    public void setUp() throws Exception {
        O = new Ostrich();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Boom!", O.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, O.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        O.upgradeSpeed();
        assertEquals(3, O.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(15, O.getPrice()); }
    }