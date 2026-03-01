import java.util.Scanner;
public class nested_loop_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       for(int i = 0 ; i < 5 ; i++){
        for(int j = 0 ; j <= i ; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    }
}