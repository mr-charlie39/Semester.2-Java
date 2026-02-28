public class Program_28 {
    public static void main(String[] args){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 - i ; j++){
                System.out.print(" ");
            }
            int l = i;
            for(int k = l + 1; k > 0 ;k--){
                System.out.print(k);
            }
            for(int m = 2 ; m < l + 2 ; m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
