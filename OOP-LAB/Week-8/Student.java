import java.util.Scanner;
public class Student {
    private String name;
    private int rollNo;
    private float marks;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.rollNo = 0;
        this.marks = 0.0f;
    }

    // Parameterized constructor
    public Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        student1.displayDetails();

        System.out.println("\nEnter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Roll No: ");
        int rollNo = scanner.nextInt();
        System.out.print("Marks: ");
        float marks = scanner.nextFloat();

        Student student2 = new Student(name, rollNo, marks);
        student2.displayDetails();
    }
}
