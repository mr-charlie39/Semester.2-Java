import java.util.Scanner;

public class student {
    String name;
    int roll_no;
    double marks;

    public student(String name , int roll_no , double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Marks: " + marks);
    }
    public char calculateGrade(){
        if(marks >= 80){
            return 'A';
        }else if(marks >= 60){
            return 'B';
        }else if(marks >= 40){
            return 'C';
        }else{
            return 'F';
        }
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the Student: ");
        String name = sc.nextLine();

        System.out.print("Enter the roll  number of the student: ");
        int roll_no = sc.nextInt();

        System.out.print("Enter the marks of the student: ");
        double marks = sc.nextDouble();

        student s = new student(name, roll_no, marks);

        s.displayDetails();
        char result = s.calculateGrade();
        System.out.println("Grade: " + result);
    }
}
