package oopsjavapractice.practiceproblem.shapehierarchy;

public class Triangle extends Shape {

    private int base;
    private int height;
    private int side1;
    private int side2;
    private int side3;


    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }


    @Override
    public void area() {

        System.out.println("Area of Triangle is: " + (0.5 * base * height));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Triangle is: " + (side1 + side2 + side3));
    }
}
