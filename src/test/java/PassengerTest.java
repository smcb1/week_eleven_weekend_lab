
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

    public Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("Susie", 2);
    }

    @Test
    public void testPassengerHasName() {
        assertEquals("Susie", passenger.getName());
    }

    @Test
    public void testNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }


}
