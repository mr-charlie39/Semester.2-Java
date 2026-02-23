import java.util.Scanner;
public class Program_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Q- Write a Java program that asks the user for their age:\r\n" + //
                        " Age < 18 → \"Not eligible to vote\"\r\n" + //
                        " Age ≥ 18 → \"Eligible to vote\"\r\n" + //
                        " Age ≥ 60 → Also print \"You are a senior citizen\"\r\n" + //
                        " ");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
            if(age >= 60){
                System.out.println("You are a senior citizen");
            }
        }
    }
}