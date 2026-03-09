import java.util.Scanner;
public class Program_4 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("4- Write a Java program that takes the marks of 5 students as input from the user. \nUse a loop to iterate five times and, within each iteration, \nuse an if-else statement to determine \nif the student has \"Passed\" (if marks are 50 or above) or \"Failed\" (if marks are below 50).");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the marks of student " + i + ": ");
            int marks = s.nextInt();
            if (marks >= 50) {
                System.out.println("Student " + i + " has Passed.");
            } else {
                System.out.println("Student " + i + " has Failed.");
            }
        }
    }
}