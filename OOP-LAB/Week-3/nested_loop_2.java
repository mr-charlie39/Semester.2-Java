import java.util.Scanner;
public class nested_loop_2 {
    public static void main(String[] args) {
        
        for(int i = 0 ; i < 5 ; i++){
            int n = 1;
            
            for(int j = i ; j < 4 ; j++){
                System.out.print(" ");
            }
            for(int  j = 0 ; j <= i ; j++){
                System.out.print(n + " ");
                n = n * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
