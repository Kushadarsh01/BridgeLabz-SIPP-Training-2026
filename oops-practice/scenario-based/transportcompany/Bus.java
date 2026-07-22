package oopsjavapractice.scenariobased.transportcompany;

public class Bus extends Vehicle{

    public Bus(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double fuelCost(double distance){
        return distance * 15;
    }
}
