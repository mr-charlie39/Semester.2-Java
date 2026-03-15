import java.util.Scanner;


public class Program_4 {
void calculateSalary(int basicSalary , int bonus){     
double totalSalary = basicSalary + bonus;
System.out.println("The total salary is : " + totalSalary);     
}

void calculateSalary(int hour  , float rate){
double totalSalary = hour * rate;
System.out.println("The total salary of hourly paid employees is : " + totalSalary);
}
public static void main(String[] args){

    System.out.println("Q4: Write a program that overloads the calculateSalary method. Oneversion calculates the salary for a full-time employee (Base Salary+Bonus), and the other for a part-time employee (Hours Worked *HourlyRate).");

Scanner s = new Scanner(System.in);

System.out.print("Enter the basic salary : ");
int basicSalary =s.nextInt();
System.out.print("Enter the bonus amount : ");
int bonus = s.nextInt();
System.out.print("Enter the number of hours worked : ");
int hour = s.nextInt();
System.out.print("Enter the hourly rate : ");
float rate = s.nextFloat();

Program_4 p = new Program_4();
p.calculateSalary(basicSalary, bonus);
p.calculateSalary(hour, rate);
}
}