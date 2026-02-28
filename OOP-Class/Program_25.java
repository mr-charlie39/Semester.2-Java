import java.util.Scanner;
public class Program_25 {

public static double calculator(int a , int b , int choice){
    double result = 0;
    switch (choice) {
        case 1:
            result = a + b;
            break;
        case 2:
            result = a - b;
            break;
        case 3:
            result = a * b;
            break;
        case 4:
            if (b != 0) {
                result = (double) a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return 0; // Return 0 or handle as needed
            }
            break;
        default:
            System.out.println("Invalid choice. Please select a valid operation.");
            return 0; // Return 0 or handle as needed
    }
    return result;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no. : ");
        int first = sc.nextInt();
        System.out.print("Enter the second no. : ");
        int second = sc.nextInt();
        System.out.println("Choose the operation you want to perform : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        double result = calculator (first , second , choice);
        System.out.println("Result: " + result);
    }
}
