import java.util.Scanner;

class Bank_account{

    String Holder_name;
    int Account_no;
    double balance;

    public Bank_account(String name , int no , double balance){
        this.Holder_name = name;
        this.Account_no = no;
        this.balance = balance; 
    }

    public double deposit(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Deposit amount : ");
        double amount = sc.nextDouble();
        return balance += amount;
    }

    public double withdraw(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Eneter amount to Withdraw : ");
        double amount = sc.nextDouble();

        return balance -= amount;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Holder name : ");

        String name = sc.nextLine();
        System.out.print("Enter the Account no : ");
        int no = sc.nextInt();
        System.out.print("Enter the Account Balance : ");
        double balance = sc.nextDouble();
        
         Bank_account b = new Bank_account(name, no, balance);

        System.out.println("Do you want to Deposit the money : ");
        System.out.print("-> Press 1 - For \"Yes.\" \n-> Press 2 - For \"No.\" \n Enter your answer... ");
        int choice_deposit = sc.nextInt();

       
        if(choice_deposit == 1){
            double result = b.deposit();
            System.out.println("Total balance is : " + result);
        }

        System.out.println("Do you want to Withdraw amount : ");
        System.out.print("-> Press 1 - For \"Yes.\" \n-> Press 2 - For \"No.\" \n Enter your answer... ");
        int choice_withdraw = sc.nextInt();

       
        if(choice_withdraw == 1){
            double result = b.withdraw();
            System.out.println("Total balance is : " + result);
        }

    }
}