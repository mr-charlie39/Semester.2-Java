import java.util.Scanner;
class Calculation{
    int age;
    String name;

    public Calculation(int age , String name){
        this.age = age;
        this.name = name;
        System.out.println("Age: " + age + ", Name: " + name);
    }
    public void celebrateBirthday(){
        age++;
        System.out.println("Happy Birthday " + name + "! You are now " + age + " years old.");
    }
    public void changeName(String newName){
        this.name = newName;
        System.out.println("Name changed to: " + name);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int ageInput = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter name: ");
        String nameInput = sc.nextLine();

        Calculation person = new Calculation(ageInput, nameInput);
        person.celebrateBirthday();

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        person.changeName(newName);
    }
}