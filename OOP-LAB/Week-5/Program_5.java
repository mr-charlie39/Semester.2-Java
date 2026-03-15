import java.util.Scanner;
public class Program_5 {

    void convert(double temp, char choice){
        if(choice == 'C' || choice == 'c'){
            double fahrenheit = (temp * 9/5) + 32;
            System.out.println(temp + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        } else if(choice == 'F' || choice == 'f'){
            double celsius = (temp - 32) * 5/9;
            System.out.println(temp + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        } else {
            System.out.println("Invalid choice! Please enter 'C' or 'F'.");
        }
    }
    public static void main(String[] args){
        System.out.println("Q5:Create a program that overloads a method convert. One versionconverts Celsius to Fahrenheit, and the other converts Fahrenheit toCelsius, depending on the user's choice. This uses a char or int parameter\r\n" + //
                        "to distinguish which conversion logic to apply, showcasinghowoverloading handles similar operations with different parameters.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature value : ");
        double temp = s.nextDouble();
        System.out.println("Enter 'C' to convert Celsius to Fahrenheit or 'F' to convert Fahrenheit to Celsius : ");
        char choice = s.next().charAt(0);
        Program_5 obj = new Program_5();
        obj.convert(temp, choice);


    }
}
