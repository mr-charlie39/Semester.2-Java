import java.util.Scanner;
class Student{
    String name;
    int rollno;
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public static void output(Student s){
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollno);
    }
}

class details extends Student{
    String address;

    details(String name, int rollno, String address){
        super(name, rollno);
        this.address = address;
    } 
        public static void output(details d){
            System.out.println("Name: " + d.name);
            System.out.println("Roll No: " + d.rollno);
            System.out.println("Address: " + d.address);
        }

}
public class Program_36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.print("Enter roll no: ");
        int rollno = s.nextInt();
        Student st = new Student(name, rollno);
        Student.output(st);

        s.nextLine(); 
        System.out.print("Enter address: ");
        String address = s.nextLine();

        int rollno2 = rollno + 1;
        details d = new details(name, rollno2, address);
        details.output(d);
        s.close();
    }
}
