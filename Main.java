public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 8);
        Rectangle r2 = new Rectangle("yallow", false, 6.6, 9.0);
        Rectangle r3 = new Rectangle(6, 9);

        r1.getPerimeter();
        System.out.println(r1);
        
        r1.getArea();
        System.out.println(r1);

        r2.getArea();
        System.out.println(r2);

        r2.getPerimeter();
        System.out.println(r2);

        Circle c1 = new Circle("read", true, 4.4);
        Circle c2 = new Circle("black", true, 5.0);

        c1.getPerimeter();
        System.out.println(c1);


        c2.getArea();
        System.out.println(c2);


    }
}