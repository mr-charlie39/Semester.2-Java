import java.util.Scanner;
public class Program_9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Q- 3. Write a Java program to calculate electricity bill based on units consumed: If units ≤ 100 charge Rs. 5 per unit Otherwise → charge Rs. 10 per unit");
        System.out.print("Enter the number of units consumed: ");
        int units = s.nextInt();

        double bill = 0;
        if(units <= 100){
            bill = units * 5;
        } else {
            bill = units * 10;
        }
        System.out.println("The electricity bill is Rs. " + bill);
    }
}
