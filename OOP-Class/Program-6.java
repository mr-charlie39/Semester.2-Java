import java.util.Scanner;

class Calculation {
    int x;
    int y;

    public Calculation(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("(" + x + "," + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculation c1 = new Calculation(a, b);
        Calculation c2 = new Calculation(4, 3);
    }
}
