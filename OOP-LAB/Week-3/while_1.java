public class while_1 {
    public static void main(String[] args) {
        int n = 1234;
        int temp = 0;


        while(n > 0){
            temp = temp * 10 + n % 10;
            n /= 10;
        }

        System.out.println("The reverse is : " + temp);
    }
}