import java.util.Scanner;

public class for_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int num = scanner.nextInt();

        String s = Integer.toString(num);
        int l = s.length();

        int sum = 0;

        for(int i = 0; i < l; i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            sum += Math.pow(digit, l);
        }

        if(sum == num) {
            System.out.println(num + " is an Armstrong number");
            System.out.println("Sum of the digits raised to the power of " + l + " is: " + sum);
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }
    }
}