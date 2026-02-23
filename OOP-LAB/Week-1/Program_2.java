import java.util.Scanner;
public class Program_2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Q- Write a Java program to find the sum and difference of squares of two numbers.");
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();

        System.out.print("Enter 2nd Second Number");
        int b=sc.nextInt();

        int square1=a*a;
        int square2=b*b;
        System.out.println("Sqaure of "+a+" is "+square1);
        System.out.println("Sqaure of "+b+" is "+square2);

        int sum=square1+square2;
        int diff=square1-square2;

        System.out.println("The sum is: "+sum);
        System.out.println("The difference is: "+diff);
    }
}