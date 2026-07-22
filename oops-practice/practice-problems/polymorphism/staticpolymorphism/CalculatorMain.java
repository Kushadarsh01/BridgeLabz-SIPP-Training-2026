package oopsjavapractice.practiceproblem.polymorphism.staticpolymorphism;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of two Integers: " + calculator.add(5, 10));
        System.out.println("Sum of three Integers: " + calculator.add(2, 5,10));
        System.out.println("Sum of two decimal Numbers: " + calculator.add(10.5, 5.5));
    }
}
