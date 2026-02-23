import java.util.Scanner;
public class Program_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Q- Write a Java program that takes marks as input and prints \"You passed the exam\" only if marks are greater than or equal to 50.");
        System.out.print("Enter your marks : ");
        int a = s.nextInt();
        if(a >= 50){
            System.out.println("You have passed the exam.");
        }
    }
}
