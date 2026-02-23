import java.util.Scanner;
public class Program_8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Q- Write a Java program that takes a year from user and print whether that year is leap year or not.");
        System.out.print("Enter the year : ");
        int year = s.nextInt();
        if(year % 4 == 0){
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
    }
}
