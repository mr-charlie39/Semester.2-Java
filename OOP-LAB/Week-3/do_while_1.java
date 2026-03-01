import java.util.Scanner;
import java.util.Random;
public class do_while_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int ra = r.nextInt(10) + 1;
        int n;
       do{
            System.out.print("Enter a number to exit: ");
            n = s.nextInt();
            System.out.println("You entered: " + n);
       } while(n != ra);

       System.out.println("Congratulations! You guessed the number " + ra);
    }
}