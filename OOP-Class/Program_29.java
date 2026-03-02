import java.util.Scanner;

class Student{
    String name;
    int age;
    String department;

    void input (String name , int age , String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void output(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Department : " + department);
    }

}

public class Program_29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter name : ");
        String n = sc.nextLine();
        System.out.print("Enter age : ");
        int a = sc.nextInt();
        System.out.print("Enter department : ");
        String d = sc.next();

        s.input(n, a, d);
        s.output();

    }

}