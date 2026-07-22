package oopsjavapractice.scenariobased.fitnesstracker;

public class FitnessDevice implements ITrackable, IReportable, INotifiable {

    int steps;
    int calories;

    public FitnessDevice(int steps, int calories) {
        this.steps = steps;
        this.calories = calories;
    }

    @Override
    public void logActivity() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Activity is Logged");
        System.out.println("Steps:- " + steps);
        System.out.println("Calories Burned:- " + calories);
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void generateReport() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("FITNESS REPORT");
        System.out.println("-----------------------------------------------------------");
        System.out.println("TOTAL STEPS:- " + steps);
        System.out.println("CALORIES BURNED:- " + calories);
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void sendAlert() {
        if (steps < 5000) {
            System.out.println("You need to walk remaining" + (5000 - steps));
        }
        else {
            System.out.println("Your goal of 5000 steps per day achieved");
        }
    }
}
