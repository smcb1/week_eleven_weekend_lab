public enum PlaneType {

    BOEING737(230, 80286),
    BOEING747(416, 910000),
    CESSNA172(3, 2450);

    private final int capacity;
    private final int maxWeight;

    PlaneType(int capacity, int maxWeight) {
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

}
