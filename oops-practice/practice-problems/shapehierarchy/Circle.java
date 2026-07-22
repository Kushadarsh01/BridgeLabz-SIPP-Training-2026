package oopsjavapractice.practiceproblem.shapehierarchy;

public class Circle extends Shape {

    private double radius;
    final private double pi = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle is: " + (pi * radius * radius));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Circle is: " + 2 * (pi * radius));
    }
}
