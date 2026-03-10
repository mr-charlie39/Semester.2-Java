import java.util.Scanner;
public class Program_35 {

    public static int divide(int a, int b){
        if(b != 0){
            System.out.println("Division: " + (a / b));
            return a / b;
        }
        else{
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public static int modulo(int a, int b){
        if(b != 0){
            System.out.println("Modulo: " + (a % b));
            return (a%b);
        }
        else{
            System.out.println("Cannot perform modulo by zero.");
            return 0;
        }
    }

    public static int divide(int a, int b, int c, int d){
        if(b != 0 && d != 0){
            System.out.println("Division: " + (a / b) + " and " + (c / d));
            return (a / b) + (c / d);
        }
        else{
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        System.out.println("Enter second number: ");
        int m = s.nextInt();

        int result = divide(n, m);
        int moduloResult = modulo(n, m);

        int l = s.nextInt();
        int k = s.nextInt(); 
        int result2 = divide(n , m , l , k);
        System.out.println("Result of division: " + result);
        System.out.println("Result of modulo: " + moduloResult);
        System.out.println("Result of third division: " + result2);
        s.close();
    }
}
