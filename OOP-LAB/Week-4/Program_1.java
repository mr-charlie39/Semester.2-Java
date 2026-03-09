import java.util.Scanner;
public class Program_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1- Write a program to simulate a smart lighting system for 5 different rooms. For each room, the user should input a brightness level (between 0 and 100).\r\n" +
                        ". \tIf the brightness is less than 30, display \"Lights ON\".\r\n" + 
                        ".\tIf it is between 30 and 70, display \"Dim Lights\".\r\n" + 
                        ". \tIf it is above 70, display \"Lights OFF\". Use a loop to process all 5 rooms.\r\n" + //
                        "");

        for(int i = 0 ;i < 5 ; i++){
            System.out.print("Enter the brightness value for room " + (i+1) + " :");
            int brightness = scanner.nextInt();
            if(brightness < 30){
                System.out.println("Lights ON");
            }
            else if(brightness >= 30 && brightness <= 70){
                System.out.println("Dim Lights");
            }
            else{
                System.out.println("Lights OFF");
            }
        }
    }
}