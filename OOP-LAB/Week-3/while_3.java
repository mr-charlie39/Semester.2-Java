import java.util.Scanner;
public class while_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the end digit of Finonacci Series: ");
        int n = s.nextInt();

        int a = 0 , b = 1;

        if(n == 1){
            System.out.println("Sum is : " + a);
        }else if(n == 0){
            System.out.println("Sum is : 0");
        }else{
            sum = a + b;
            while(n > 2){
                int c = a + b;
                sum += c;
                a = b;
                b = c;
                n--;
            }
            System.out.println("Sum is : " + sum);
        }
    }
}
