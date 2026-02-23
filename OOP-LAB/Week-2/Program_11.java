import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        System.out.println("Q- 1.2.\tWrite a Java program that takes marks as input and prints the grade:\r\n" + //
                        "\tMarks ≥ 90  Grade A\r\n" + //
                        "\tMarks ≥ 75  Grade B\r\n" + //
                        "\tMarks ≥ 50  Grade C\r\n" + //
                        "\tMarks < 50  Grade F\r\n" + //
                        "");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}
