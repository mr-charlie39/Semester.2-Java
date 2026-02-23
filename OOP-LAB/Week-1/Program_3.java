import java.util.Scanner;;
public class Program_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Q- Write a Java program to find the square of a number and check whether it is greater than, less than or equal to 1000.");
        System.out.print("Enter a Number : ");
        int a=sc.nextInt();
        int square=a*a;
        System.out.print("Square of " + a + " is " + square);
        if(square>1000)
        {
            System.out.print("Square is Greater than 1000");
        }
        else if(square<1000){
            System.out.print("Square is Lower than 1000");
        }
        else{
            System.out.print("Square is equal to 1000");
        }
        
    }
    
}