import java.util.Scanner;

public class Program_3 {

    void calculateInterest(int principal , int rate , int time)
    {
        double interest = (principal * rate * time) / 100;
        System.out.println("The simple interest is : " + interest);
    }

    public static void main(String[] args){

        System.out.println("Q3: Create a program that uses a method calculateInterest to computethesimple interest based on Principal, Rate, and Time provided by theuser\r\n" + //
                        "via the Scanner class.");

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the principal amount : ");
        int principal = s.nextInt();
        System.out.println("Enter the rate of interest : ");
        int rate = s.nextInt();
        System.out.println("Enter the time period : ");
        int time = s.nextInt();

        Program_3 obj = new Program_3();

        obj.calculateInterest(principal , rate , time);

    }
}