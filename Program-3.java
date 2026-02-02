import java.util.Scanner;
public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<=============== Largest of three numbers: =================>");
        System.out.print("Enter first no. : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second no. : ");
        int n2 = sc.nextInt();
        System.out.print("Enter third no. :");
        int n3 = sc.nextInt();

        if(n1 > n2){
            if(n1 > n3 ){
                System.out.println(n1 + " is largest : ");
            }else {
                System.out.println(n3 + " is Largest :");
            }
        }else {
            if(n2 > n3){
                System.out.println(n2 + " is largest : ");
            }else{
                System.out.println(n3 + " is largest : ");
            }
        }
    }
}