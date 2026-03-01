import java.util.Scanner;
public class for_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int b = s.nextInt();
        System.out.print("Enter the Exponent : ");
        int e = s.nextInt();

        int result = 1;

        for(int i = 0 ; i < e ; i++){
            result *= b;
        }
        System.out.println("Result = " + result);
    }
}