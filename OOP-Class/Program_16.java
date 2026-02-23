public class Program_16 {
    public static void main(String[] args){
        System.out.println("Pattern of Stars: ");

        for(int i = 0 ; i < 4 ; i++){
            if(i == 0 || i == 3){
                for(int j = 0; j < 5 ; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }else{
                for(int j = 0; j < 5; j++){
                    if(j == 0 || j == 4){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                    
                }
                System.out.println();
            }
        }
    }
}
