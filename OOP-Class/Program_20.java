public class Program_20 {
    public static void main(String[] args){
        System.out.println("Pattern of Digits: ");

        int n = 1;
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(" " + n + " ");
                n++;
            } 
            System.out.println();
        }
    }
}
