public class Passenger {

    private String name;
    private int numberOfBags, totalBaggageWeight;

    public Passenger(String name, int numberOfBags, int totalBaggageWeight) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.totalBaggageWeight = totalBaggageWeight;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public int getTotalPassengerBaggageWeight() {
        return totalBaggageWeight;
    }

    public void setTotalBaggageWeight(int totalBaggageWeight) {
        this.totalBaggageWeight = totalBaggageWeight;
    }
}
