import java.util.Scanner;
public class Program_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Q- Write a Java program that takes two numbers and an operator (+, -, *, /) as input and performs the\r\n" + //
                        "operation using a switch statement. ");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0); 

        switch (operator){
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if(b != 0){
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
        
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}
