import java.util.Scanner;
public class do_while {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = s.nextInt();
        int t = 10;

        do{
            System.out.println(num + " x " + t + " = " + (num*t));
            t--;
        }while(t > 0);
    }
}
