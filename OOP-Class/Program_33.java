import java.util.Scanner;

class student_management_system{
    String name;
    int age;
    int semester;
    String classes;
    String course;
    public double total_marks = 0;
    public double avg_marks;


    student_management_system(String name , int age, int semester , String classes , String course){
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.classes = classes;
        this.course = course;
    }

    double marks (int mark){
        return (this.total_marks += mark );
    }

    void  Avegrade(int n){
        this.avg_marks = (total_marks / n);
    }

}

class grade extends student_management_system {

    grade(String name, int age, int semester, String classes, String course) {
        super(name, age, semester, classes, course);
    }

    void details(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Semester : " + semester);
        System.out.println("Classes : " + classes);
        System.out.println("Course : " + course);
    }
    void output(){
        if(avg_marks >= 90){
            System.out.println("Grade : A");
        }else if(avg_marks >= 80){
            System.out.println("Grade B");
        }else if(avg_marks >= 70){
            System.out.println("Grade C");
        }else if(avg_marks >= 60){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }
}

public class Program_33 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("How many students do you want to enter? : ");
        int n = s.nextInt();

        student_management_system[] student = new student_management_system[n];

        for(int i = 0 ;i < n ; i++){
            System.out.print("Enter name : ");
            String name = s.next();
            s.nextLine();

            System.out.print("Enter age : ");
            int age = s.nextInt();
            s.nextLine();

            System.out.print("Enter semester : ");
            int semester = s.nextInt();

            System.out.print("Enter classes : ");
            String classes = s.next();
            s.nextLine();

            System.out.print("Enter course : ");
            String course = s.next();
            s.nextLine();

            student[i] = new grade(name, age, semester, classes, course);

            System.out.print("How many marks do you want to enter for " + name + " ? : ");
            int m = s.nextInt();

            for(int j = 0 ; j < m ; j++){
                System.out.print("Enter marks : ");
                int mark = s.nextInt();
                student[i].marks(mark);
            }

            student[i].Avegrade(m);

            System.out.println("Details of student ");
            ((grade) student[i]).details();
            ((grade) student[i]).output();
        }
    }
}