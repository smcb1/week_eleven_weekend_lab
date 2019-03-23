import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Flight lightFlight;
    private Plane plane;
    private Plane lightPlane;
    private Passenger passenger;


    @Before
    public void setUp() {
        passenger = new Passenger("Susie", 2);
        plane = new Plane(PlaneType.BOEING737);
        lightPlane = new Plane(PlaneType.CESSNA172);
        flight = new Flight(plane, "BA-123", "GLA", "LGW", "09:30");
        lightFlight = new Flight(lightPlane, "ASD-123", "GLA", "EDI", "12:00" );
    }

    @Test
    public void testFlightHasPlane() {
        assertEquals(PlaneType.BOEING737, plane.getPlane());
    }

    @Test
    public void testFlightHasFlightNumber() {
        assertEquals("BA-123", flight.getFlightNumber());
    }

    @Test
    public void testFlightStartsWithNoPassengers() {
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void testFlightHasDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void testFlightHasDestinationAirport() {
        assertEquals("LGW", flight.getDestinationAirport());
    }

    @Test
    public void testFlightHasDepartureTime() {
        assertEquals("09:30", flight.getDepartureTime());
    }

    @Test
    public void testAddPassengerToFlightSuccess() {
        flight.addPassengerToFlight(passenger);
        assertEquals(1, flight.getFlightPassengers());
    }

    @Test
    public void testAddPassengerToFlightFail() {
        lightFlight.addPassengerToFlight(passenger);
        lightFlight.addPassengerToFlight(passenger);
        lightFlight.addPassengerToFlight(passenger);
        lightFlight.addPassengerToFlight(passenger);
        assertEquals(3, lightFlight.getPassengerCount());
    }

    @Test
    public void testNumberOfRemainingSeats() {
        flight.addPassengerToFlight(passenger);
        assertEquals(229, flight.getVacantSeats());
    }


}
