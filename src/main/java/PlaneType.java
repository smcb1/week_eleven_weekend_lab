public enum PlaneType {

    BOEING737(230, 4600, 80286),
    BOEING747(416, 8320, 910000),
    CESSNA172(3, 60, 2450);

    private final int capacity;
    private final int maxBaggageWeight;
    private final int maxPlaneWeight;

    PlaneType(int capacity, int maxBaggageWeight, int maxPlaneWeight ) {
        this.capacity = capacity;
        this.maxBaggageWeight = maxBaggageWeight;
        this.maxPlaneWeight = maxPlaneWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxBaggageWeight() {
        return maxBaggageWeight;
    }

    public int getMaxPlaneWeight() {
        return maxPlaneWeight;
    }
}
