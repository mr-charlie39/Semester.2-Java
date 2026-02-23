import java.util.Scanner;
public class Program_15 {
    public static void main(String[] args){
        System.out.println("Q- Write a Java program that takes a month number (1–12) as input and prints the number of days in\nthat month. For February, assume 28 days.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Number of days: 31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Number of days: 30");
                break;
            case 2:
                System.out.println("Number of days: 28");
                break;
            default:
                System.out.println("Error: Invalid month number.");
                break;
        }
    }
}
