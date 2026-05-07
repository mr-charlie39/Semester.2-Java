import java.util.Scanner;
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Rectangle rect1 = new Rectangle();
        System.out.println("Area of default rectangle: " + rect1.area());

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rect2 = new Rectangle(length, width);
        System.out.println("Area of custom rectangle: " + rect2.area());
    }
}
