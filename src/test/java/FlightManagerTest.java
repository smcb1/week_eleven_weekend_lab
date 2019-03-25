import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("Susie", 2, 10);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "BA-123", "GLA", "LGW", "09:00");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void testMaxAllowedBaggageWeight() {
        assertEquals(20, flightManager.getMaxPassengerBaggageAllowance());
    }

    @Test
    public void testPassengerTotalBaggageWeight() {
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        assertEquals(30, flightManager.getPassengersTotalBaggageWeight());
    }

    @Test
    public void testRemainingBaggageWeight() {
        flight.addPassengerToFlight(passenger);
        assertEquals(8310, flightManager.getRemainingBaggageWeight());
    }

}
