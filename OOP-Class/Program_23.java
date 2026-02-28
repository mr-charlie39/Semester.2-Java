import java.util.Scanner;

public class Program_23 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        int original = n; 
        int remainder;
        int reverse = 0;

        while(n > 0){
            remainder = n % 10;
            reverse = (reverse * 10) + remainder;
            n = n / 10;
        }

        System.out.println("Reverse of the number is: " + reverse);

        if(reverse == original){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }

        s.close();
    }
}