import java.util.Scanner;
public class do_while_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum  = 0;
        int  num;
        do{
            System.out.print("Enter a number : ");
            num = s.nextInt();
            if(num > 0){
            sum += num;
            }
        }while(num > 0);

        System.out.println("Sum of all numbers is: " + sum);
    }
}
