package oopsjavapractice.practiceproblem.shapehierarchy;

import java.util.Scanner;

public class ShapeMenu extends ShapeMenuAbs{

    Shape shape;

    @Override
    public void choices() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Exit");
            int choice = sc.nextInt();

            if (choice == 4) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter radius of circle: ");
                    double radius = sc.nextDouble();

                    Circle circle = new Circle();
                    circle.setRadius(radius);
                    shape = circle;

                    shape.area();
                    shape.perimeter();
                    break;

                case 2:
                    System.out.println("Enter length of rectangle: ");
                    int length = sc.nextInt();
                    System.out.println("Enter breadth of rectangle: ");
                    int breadth = sc.nextInt();

                    Rectangle rectangle = new Rectangle();
                    rectangle.setLength(length);
                    rectangle.setBreadth(breadth);
                    shape = rectangle;

                    shape.area();
                    shape.perimeter();
                    break;

                case 3:
                    System.out.println("Enter base of triangle: ");
                    int base = sc.nextInt();
                    System.out.println("Enter height of triangle");
                    int height = sc.nextInt();
                    System.out.println("Enter 1st side of triangle: ");
                    int side1 = sc.nextInt();
                    System.out.println("Enter 2nd side of triangle: ");
                    int side2 = sc.nextInt();
                    System.out.println("Enter 3rd side of triangle: ");
                    int side3 = sc.nextInt();

                    Triangle triangle = new Triangle();
                    triangle.setBase(base);
                    triangle.setHeight(height);
                    triangle.setSide1(side1);
                    triangle.setSide2(side2);
                    triangle.setSide3(side3);
                    shape = triangle;

                    shape.area();
                    shape.perimeter();
                    break;

                default:
                    System.out.println("Invalid Choice !!");
            }
        }
        sc.close();
    }
}
