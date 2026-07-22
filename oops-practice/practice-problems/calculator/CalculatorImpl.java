package oopsjavapractice.practiceproblem.calculator;

public class CalculatorImpl implements ICalculator {
    @Override
    public int add (int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }
}
