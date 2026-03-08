import java.util.Scanner;
import java.util.*;

class details extends Program_34_1{
    public String address;
    void displa_1(){
        System.out.println("Address: " + address);
    }
}

public class Program_34_2{

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    details p = new details();
    System.out.print("Enter name: ");
    p.name = s.nextLine();
    System.out.print("Enter age: ");
    p.age = s.nextInt();
    s.nextLine();
    System.out.print("Enter address: ");
    p.address = s.nextLine();
    p.display();
    p.displa_1();
    }
}
