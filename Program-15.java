import java.util.Scanner;

/* -------- Interface 1 -------- */
interface Area_2 {
    void circle();
    void oval();
}

/* -------- Interface 2 -------- */
interface Area extends Area_2 {
    void rectangle();
    void square();
}

/* -------- Main Class -------- */
public class ShapeArea implements Area {

    Scanner sc = new Scanner(System.in);

    /* Rectangle */
    @Override
    public void rectangle() {
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        double area = l * b;

        System.out.println("Area of Rectangle = " + area);
        System.out.println();
    }

    /* Square */
    @Override
    public void square() {
        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();

        double area = s * s;

        System.out.println("Area of Square = " + area);
        System.out.println();
    }

    /* Circle */
    @Override
    public void circle() {
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("Area of Circle = " + area);
        System.out.println();
    }

    /* Oval (Ellipse) */
    @Override
    public void oval() {
        System.out.print("Enter major radius: ");
        double a = sc.nextDouble();

        System.out.print("Enter minor radius: ");
        double b = sc.nextDouble();

        double area = Math.PI * a * b;

        System.out.println("Area of Oval = " + area);
        System.out.println();
    }

    /* -------- Main Method -------- */
    public static void main(String[] args) {

        ShapeArea sa = new ShapeArea();

        sa.square();
        sa.circle();
        sa.oval();
        sa.rectangle();
    }
}
