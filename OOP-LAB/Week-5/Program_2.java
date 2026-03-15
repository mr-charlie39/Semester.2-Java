import java.util.Scanner;

public class Program_2 {

void FindMax(int a , int b){
    if(a>b){
        System.out.println("The maximum number is : " + a);
    }else{
        System.out.println("The maximum number is : " + b);
    }

}

void FindMax(double a , double b){
    if(a>b){
        System.out.println("The maximum number is : " + a);
    }else{
        System.out.println("The maximum number is : " + b);
    }

}

public static void main(String[] args) {

    System.out.println("Q2:Implement a program that overloads a method findMax to findthelargest number among two integers and, separately, two double-precisionfloating-point numbers.");
    Scanner s = new Scanner(System.in);
    Program_2 obj = new Program_2();

    obj.FindMax(10, 20);

    obj.FindMax(30.6 , 25.4);



}

}