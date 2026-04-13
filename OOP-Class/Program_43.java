import java.util.Scanner;
public class Program_43 {

    static void volume(double side){
        double volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    static void volume(double side , double height){
        double volume = 3.1416 * side * side * height;
        System.out.println("Volume of Cylinder: " + volume);
    }

    static void volume(double base , double height , double length){
        double volume = 0.5 * base * height * length;
        System.out.println("Volume of Triangle: " + volume);
    }

    void Area(double side){
        double area = 3.1416 * side * side;
        System.out.println("Area of Circle: " + area);
    }

    void Area(double length , double width){
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);

        Program_43 p = new Program_43();
        System.out.println("Which Shape volume you want to calculate: ");
        System.out.println("1- Cube:");
        System.out.println("2- Cylinder:");
        System.out.println("3- Triangle:");
        int choice = s.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the side of Cube: ");
                double side = s.nextDouble();
                volume(side);
                break;
            case 2:
                System.out.println("Enter the radius of Cylinder: ");
                double radius = s.nextDouble();
                System.out.println("Enter the height of Cylinder: ");
                double height = s.nextDouble();
                volume(radius, height);
                break;
            case 3:
                System.out.println("Enter the base of Triangle: ");
                double base = s.nextDouble();
                System.out.println("Enter the height of Triangle: ");
                double triangleHeight = s.nextDouble();
                System.out.print("Enter the length of Triangle: ");
                double length = s.nextDouble();
                volume(base, triangleHeight, length);
                break;
        }

        System.out.println("Which shape Area you want to calculate: ");
        System.out.println("1- Circle:");
        System.out.println("2- Rectangle:");
        int areaChoice = s.nextInt();

        switch(areaChoice){
            case 1:
                System.out.print("Enter the radius of Circle: ");
                double radius = s.nextDouble();
                p.Area(radius);
                break;
            case 2:
                System.out.print("Enter the length of Rectangle: ");
                double length = s.nextDouble();
                System.out.print("Enter the width of Rectangle: ");
                double width = s.nextDouble();
                p.Area(length, width);
                break;
        }

    }
}
