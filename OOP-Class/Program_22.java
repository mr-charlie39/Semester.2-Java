import java.util.Scanner;

public class Program_22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Batterfly Pattern:");

        int n = 9;
        int inc = 2;
        int dec = 2;
        for(int i = 0 ; i < n ; i++){
            if(i <= n/2){
            for(int j = 0 ; j <=i ; j++){
                System.out.print("*");
            }
            for(int s = 0 ; s < (n - inc) ; s++){
                System.out.print(" ");
            }
            if(i != 4){
            for(int k = 0 ; k <=i ; k++){
                
                System.out.print("*");
            }
        }else{
            for(int k = 0 ; k < i ; k++){
                
                System.out.print("*");
            }
        }

            inc+=2;
            System.out.println();
        }else{
            for(int j = 0 ; j < (n - (i)) ; j++){
                System.out.print("*");
            }
            for(int s = 1 ; s < dec ; s++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < (n - (i)) ; k++){
                
                System.out.print("*");
            }
            dec+=2;
            System.out.println();
            
        }
        
    }

}
}