import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("grrrr (with fire)", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {assertEquals(1000, d.getPrice());
    }
}
