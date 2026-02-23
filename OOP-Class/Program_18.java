public class Program_18 {
    public static void main(String[] args){
        System.out.println("Pattern of Stars: ");

        for(int i = 0 ; i < 5 ; i++){
            for(int j = i ; j < 4 ; j++){
                System.out.print("   ");
            }
            for(int k = 0 ; k <= i ; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
