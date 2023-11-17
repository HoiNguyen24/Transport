package src;

public class Airplane extends Transport{
    public Airplane(String sourse, String destination, double distance) {
        super(sourse, destination, distance);
    }
    private double DiscountCalculateForDistance(double number){
        if(number >  Const.AvailableDiscountDistanceOne)
            return Const.discount10Percent;
       else if(number > Const.AvailableDiscountDistanceTwo)
           return Const.discount20Percent;
       else
           return 1.0;
    }
    @Override
    public double calculateCost() {
        return DiscountCalculateForDistance(this.distance)*this.distance*Const.Airplane_CostPerDistance;
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
}
