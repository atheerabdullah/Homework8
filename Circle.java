import java.util.Scanner;

public class Circle extends Shape {

    private double radius;

    //constructor

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
    }

    //getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area is = " + area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is = " + perimeter);
        return perimeter;
    }
}
