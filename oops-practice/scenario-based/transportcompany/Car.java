package oopsjavapractice.scenariobased.transportcompany;

public class Car extends Vehicle{

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double fuelCost(double distance){
        return distance * 10;
    }
}
