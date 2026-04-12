public class Program_41 {
    public static void main(String[] args) {
        int l = 0;
        int[] prime = new int[15];
        int check = 0;

        for(int i = 1 ; i <= 30 ; i++){
            for(int j = 1 ; j <= i ; j++){
                if(i % j == 0 ){
                    check++;
                }
            }
            if(check == 2){
                prime[l] = i;
                l++;
            }
            check = 0;
        }
        int s = 0;
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print(prime[s] + " ");
                s++;
            }
            System.out.println();
        }

    }
}
