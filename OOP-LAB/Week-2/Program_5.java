import java.util.Scanner;
public class Program_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Q- Write a Java program that takes a number as input and prints \"The number is positive\" only if the number is Positive:");

        System.out.print("Enter the number : ");
        int a = s.nextInt(); 

        if(a > 0){
            System.out.println("The number is positive.");
        }
        
    }
}