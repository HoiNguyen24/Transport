package src;

public abstract class Transport {
    protected String sourse;
    protected String destination;
    protected double distance;

    public Transport(String sourse, String destination, double distance) {
        this.sourse = sourse;
        this.destination = destination;
        this.distance = distance;
    }
    public abstract double calculateCost();

    public abstract String getSourse();

    public abstract String getDestination();

    public abstract double getDistance();
}
