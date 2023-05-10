public class Rectangle extends Shape {

    private double width;
    private double length;

    //constructor


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this.length = 1.0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    // getter and setter


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = width * length;
        System.out.println("Area of rectangle=" + area);
        return area;
    }

    public double getPerimeter() {
        float a, b, c, d, perimeter;
        a = c = 5;
        b = d = 4;
        perimeter = 2 * (a + b);
        System.out.println("Perimeter of Rectangle is: " + perimeter);
        return perimeter;
    }

}
