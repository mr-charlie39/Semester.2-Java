import java.util.Scanner;

class Person{
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

public class Program_31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Person p1 = new Person();
        System.out.print("Enter name : ");
        p1.setName(s.nextLine());
        System.out.print("Enter age : ");
        p1.setAge(s.nextInt());
        p1.display();
    }
}