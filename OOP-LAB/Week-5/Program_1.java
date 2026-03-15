import java.util.Scanner;

public class Program_1{

    void calculateArea(int radius){
        double area = 3.1416 * radius * radius ;
        System.out.println("Area of Circle is : " + area);
    }

    void calculateArea(int length, int breadth){
        int area = length * breadth ;
        System.out.println("Area of Rectangle is : " + area);
    }

    void calculateArea(float side1){
        float area = side1 * side1 ;
        System.out.println("Area of Square is : " + area);
    }
    public static void main(String[] args){

        System.out.println("Q1:Write a program that overloads a method calculateArea to compute the area of acircle (using radius), a rectangle (using length and breadth), and a square(using side length). The program should prompt the user for the necessary inputs and display the calculated area accordingly.");
        Scanner scanner = new Scanner(System.in);
        Program_1 program = new Program_1();

        System.out.print("Which area you want to calculate : \n1. Circle \n2. Rectangle \n3. Square \nEnter your choice...  ");

        int choice = scanner.nextInt();
        

        if(choice == 1){
            System.out.print("Enter the radius of the circle: ");
            int radius = scanner.nextInt();
            program.calculateArea(radius);
        } else if(choice == 2){
            System.out.print("Enter the length of the rectangle: ");
            int length = scanner.nextInt();
            System.out.print("Enter the breadth of the rectangle: ");
            int breadth = scanner.nextInt();
            program.calculateArea(length, breadth);
        } else if(choice == 3){
            System.out.print("Enter the side of the square: ");
            float side = scanner.nextFloat();
            program.calculateArea(side);

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}