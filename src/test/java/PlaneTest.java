import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void testPlaneCapacity() {
        assertEquals(230, plane.getCapacity());
    }

    @Test
    public void testMaxBaggageWeight() {
        assertEquals(4600, plane.getMaxBaggageWeight());
    }

    @Test
    public void testPlaneMaxWeight() {
        assertEquals(80286, plane.getMaxPlaneWeight());
    }

}
