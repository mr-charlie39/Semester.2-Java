public class while_4 {
    public static void main(String[] args) {
        System.out.print("Enter the binary number: ");
        int binary = new java.util.Scanner(System.in).nextInt();

        int sum = 0;

        for(int i = 0 ; binary > 0 ; i++){
            int rem = binary % 10;
            if(rem == 1){
                sum += Math.pow(2, i);
            }
            binary /= 10;
        }
        System.out.println("Decimal equivalent is: " + sum);
    }

}
