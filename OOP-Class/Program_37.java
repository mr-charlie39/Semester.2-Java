import java.util.Scanner;
abstract class Shape{
    double length;
    double breadth;
    abstract int area();
    abstract int perimeter();
    abstract void display();
    abstract void input();
}

class input extends Shape{
   
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter the length : ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth : ");
        breadth = sc.nextDouble();
    }
    int area(){
        return (int)(length * breadth);
    }
    int perimeter(){
        return (int)(2 * (length + breadth));
    }
    void display(){
        System.out.println("Area of the rectangle: " + area());
        System.out.println("Perimeter of the rectangle: " + perimeter());
    }
    public Scanner getSc() {
        return sc;
    }
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}

public class Program_37 {
    public static void main(String[] args) {
        input rect = new input();
        rect.input();
        rect.display();
    }
}