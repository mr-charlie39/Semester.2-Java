public class Program_27 {
    public static void main(String[] args){
        for(int i = 0 ;i < 5 ; i++){
            for(int j = 1 ; j < (5 - i) ; j++){
                System.out.print(" ");
            }
            int l = i;
            for(int k = 1 ; k < (l + 2) ; k++){
                System.out.print(l+1);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
