import java.util.ArrayList;
import java.util.Collection;

public class Flight {

    private Plane plane;
    private ArrayList<Passenger> passengerManifest;
    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String departureAirport, String destinationAirport, String departureTime) {
        this.plane = plane;
        this.passengerManifest = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public ArrayList<Passenger> getPassengerManifest() {
        return passengerManifest;
    }

    public void setPassengerManifest(ArrayList<Passenger> passengerManifest) {
        this.passengerManifest = passengerManifest;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getPassengerCount() {
        return this.getPassengerManifest().size();
    }

    public int getFlightPassengers() {
        return this.getPassengerCount();
    }

    public void addPassengerToFlight(Passenger passenger) {
        if (getPassengerCount() < this.plane.getCapacity()) {
            this.passengerManifest.add(passenger);
        }
    }

    public int getVacantSeats() {
        return plane.getCapacity() - getPassengerCount();
    }

    public int getMaxBaggageWeight() {
        return plane.getMaxBaggageWeight();
    }

    public int getCapacity() {
        return plane.getCapacity();
    }

    public int getTotalPassengerBaggageWeight() {
        int totalBaggageWeight = 0;
        for (Passenger passenger : this.passengerManifest) {
            totalBaggageWeight += passenger.getTotalPassengerBaggageWeight();
        }
        return totalBaggageWeight;
    }

    public int getRemainingBaggageWeight() {
        int totalRemainingBaggageWeight = this.getMaxBaggageWeight();
        for (Passenger passenger : this.passengerManifest) {
            totalRemainingBaggageWeight -= passenger.getTotalPassengerBaggageWeight();
        }
        return totalRemainingBaggageWeight;
    }
}
