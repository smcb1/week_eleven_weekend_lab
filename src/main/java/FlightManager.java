public class FlightManager {

    Flight flight;
    Plane plane;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

//    public Plane getPlane() {
//        return plane;
//    }


    public int getMaxPassengerBaggageAllowance() {
        return this.flight.getMaxBaggageWeight() / this.flight.getCapacity();
    }

    public int getPassengersTotalBaggageWeight() {
        return this.flight.getTotalPassengerBaggageWeight();
    }


}
