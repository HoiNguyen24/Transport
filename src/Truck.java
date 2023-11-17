package src;

public class Truck extends Transport{
    public Truck(String sourse, String destination, double distance) {
        super(sourse, destination, distance);
    }
    private double DiscountCalculate(double number){
        if(number >  Const.AvailableDiscountDistanceOne)
            return Const.discount10Percent;
        else if(number > 2 * Const.AvailableDiscountDistanceTwo)
            return Const.discount20Percent;
        else
            return 1.0;
    }
    @Override
    public String getSourse() {
        return this.sourse;
    }

    @Override
    public String getDestination() {
        return this.destination;
    }

    @Override
    public double getDistance() {
        return this.distance;
    }

    @Override
    public double calculateCost() {
        return  DiscountCalculate(this.distance)*this.distance*Const.Truck_CostPerDistance;
    }
}
