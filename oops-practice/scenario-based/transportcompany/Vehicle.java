package oopsjavapractice.scenariobased.transportcompany;

public abstract class Vehicle {
    protected String VehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.VehicleNumber = vehicleNumber;
    }

    public abstract double fuelCost(double distance);
}
