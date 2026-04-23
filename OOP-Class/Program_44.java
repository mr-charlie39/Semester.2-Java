import java.util.Scanner;
public class Program_44 {
    public float length;
    public float width;

    public Program_44(float length , float width){
        this.length = length;
        this.width = width;
    }

    public float area(){
        return length*width;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        float length = s.nextFloat();
        System.out.println("Enter the width of the rectangle : ");
        float width = s.nextFloat();
        Program_44 r = new Program_44(length, width);
        System.out.println("The area of the rectangle is : " + r.area());
    }
}