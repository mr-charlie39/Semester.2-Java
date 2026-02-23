import java.util.Scanner;
public class Program_10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Q- 4. 1.	Write a Java program that takes three numbers from the user and prints the largest number.");
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter second number: ");
        int b = s.nextInt();
        System.out.print("Enter third number: ");
        int c = s.nextInt();

        if(a > b){
            if(a > c){
                System.out.println("The largest number is: " + a);
            } else {
                System.out.println("The largest number is: " + c);
            }
        }else{
            if(c > b){
                System.out.println("The largest number is: " + c);
            } else {
                System.out.println("The largest number is: " + b);
            }
        }
    }
}
