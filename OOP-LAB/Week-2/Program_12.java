import java.util.Scanner;
public class Program_12 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Q- Write a Program that takes a year as input and checks whether it is a leap year or not. A year is divisible by 400 --> leap year. A year is divisible by 100 but not by 400 --> not a leap year. A year is divisible by 4 but not by 100 --> leap year. Otherwise, it is not a leap year.\n");
        System.out.print("Enter a year: ");
        int year = s.nextInt();
        if(year % 400 == 0){
            System.out.println(year + " is a leap year.");
        } else if(year % 100 == 0){
            System.out.println(year + " is not a leap year.");
        } else if(year % 4 == 0){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
