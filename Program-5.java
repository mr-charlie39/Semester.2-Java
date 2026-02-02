import java.util.Scanner;
class Fibonacci{
    static int series(int n){
      if (n <= 0) return 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr[n - 1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = series(n);
        System.out.println(result);
    }
}