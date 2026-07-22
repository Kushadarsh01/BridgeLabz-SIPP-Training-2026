package oopsjavapractice.scenariobased.transportcompany;

public class Bike extends Vehicle{

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double fuelCost(double distance){
        return distance * 3;
    }
}