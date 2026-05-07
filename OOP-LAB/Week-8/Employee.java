import java.util.Scanner;
public class Employee {
    private int empId;
    private String name;
    private double salary;

     
    public Employee() {
        this.empId = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

\    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Employee emp1 = new Employee();
        System.out.println("Default Employee Details:");
        emp1.displayDetails();

        System.out.println("\nEnter employee details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        Employee emp2 = new Employee(empId, name, salary);
        System.out.println("\nUser-Input Employee Details:");
        emp2.displayDetails();
    }
}
