import java.util.Scanner;
public class while_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = s.nextInt();
        int sum = 0;
        while(n > 0){

            int temp = n % 10;
            sum += temp;
            n /= 10;

        }
        System.out.println("Sum of digits : $" + sum);
    } 
}
