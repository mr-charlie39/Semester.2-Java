import java.util.Scanner;
public class Program_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("2- A cinema offers different ticket prices based on age. Write a program that asks for the total number of people in a group. Then, using a loop, take the age of each person as input and determine their ticket price:");
        System.out.println(".  Age < 12 (Child Discount Rs.200).");
        System.out.println(".  Age >= 60 (Senior Discount Rs.500).");
        System.out.println(".  Otherwise: Rs.100 (Standard Price). Display the price for each person individually.");

        System.out.print("\nEnter the total number of people in the group: ");
        int totalPeople = s.nextInt();

        for (int i = 1; i <= totalPeople; i++) {
            System.out.print("Enter the age of person " + i + ": ");
            int age = s.nextInt();
            if (age < 12) {
                System.out.println("Ticket price for person " + i + ": Rs.200 (Child Discount)");
            } else if (age >= 60) {
                System.out.println("Ticket price for person " + i + ": Rs.500 (Senior Discount)");
            } else {
                System.out.println("Ticket price for person " + i + ": Rs.100 (Standard Price)");
            }
        }
    }
}
