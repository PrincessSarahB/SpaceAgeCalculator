import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    Planet planet;

    @Before
    public void setUp() throws Exception {
        planet = new Planet("Mercury", 0.2408467);
    }

    @Test
    public void hasName() {
        assertEquals("Mercury", planet.getName());
    }


}
