import java.util.Scanner;
public class Program_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Design a machine monitoring system that records the temperature of a machine every hour for a 4-hour shift.\r\n" + //
                        ".\tUse a for loop to iterate through each hour.\r\n" + //
                        ".\tIf the temperature is above 80 degrees, print a “CRITICAL” warning.\r\n" + //
                        ".\tIf it is between 51 and 80, print “NORMAL”.\r\n" + //
                        ".\tIf it is 50 or below, print \"IDLE\".\r\n" + //
                        "");
        for (int hour = 1; hour <= 4; hour++) {
            System.out.print("Enter the temperature of the machine at hour " + hour + ": ");
            int temperature = s.nextInt();
            if (temperature > 80) {
                System.out.println("CRITICAL");
            } else if (temperature >= 51) {
                System.out.println("NORMAL");
            } else {
                System.out.println("IDLE");
            }
        }
    }
}
