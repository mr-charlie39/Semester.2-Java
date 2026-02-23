import java.util.Scanner;
public class program_4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Q- Write a Java program to find the sum, average, product, largest and smallest of three numbers.");

        System.out.print("Enter 1st no. : ");
        int a = s.nextInt();

        System.out.print("Enter 2nd no. : ");
        int b = s.nextInt();

        System.out.print("Enter 3rd no. : ");
        int c = s.nextInt();

        System.out.println("Sum of Digits are : " + (a+b+c));
        System.out.println("Average of Digits are : " + ((a+b+c)/3.0));
        System.out.println("Product of Digits are : " + (a*b*c));

        int largst = 0;

        if(a > b){
            if(a > c){
                largst = a;
            }else{
                largst = c;
            }
        }else{
            if(b > c){
                largst = b;
            }else{
                largst = c;
            }
        }
        System.out.println("Largest of Digits are : " + largst);


        int smallest = 0;
        if(a < b){
            if(a < c){
                smallest = a;
            }else{
                smallest = c;
            }
        }else{
            if(b < c){
                smallest = b;
            }else{
                smallest = c;
            }
        }
        System.out.println("Smallest of Digits are : " + smallest);
    }
}
