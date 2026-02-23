import java.util.Scanner;
public class Program_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Q- Write a Java program that takes a number as input and prints \"The number is even or odd\" only if the number is even or odd.");

        System.out.print("Enter the number : ");
        int a = s.nextInt(); 

        if(a % 2 == 0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
}