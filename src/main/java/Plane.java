public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public PlaneType getPlane() {
        return plane;
    }

    public void setPlane(PlaneType plane) {
        this.plane = plane;
    }

    public int getCapacity() {
        return this.plane.getCapacity();
    }

    public int getMaxWeight() {
        return this.plane.getMaxWeight();
    }
}
