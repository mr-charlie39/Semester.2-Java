import java.util.Scanner;

class Bank_account {
    String HolderName;
    int AccountNumber;
    double Balance;

    // Constructor
    Bank_account(String HolderName, int AccountNumber, double Balance) {
        this.HolderName = HolderName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            this.Balance += amount;
            System.out.println("Deposit Successful!");
            System.out.println("Total Balance: " + this.Balance);
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= this.Balance && amount > 0) {
            this.Balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + this.Balance);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    // Transfer Method
    public void transfer(Bank_account toAccount, double amount) {
        if (amount <= this.Balance && amount > 0) {
            this.Balance -= amount;
            toAccount.Balance += amount;
            System.out.println("Transfer Successful to Account: " + toAccount.AccountNumber);
            System.out.println("Remaining Balance: " + this.Balance);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    // Account Info
    public void info() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Holder Name: " + this.HolderName);
        System.out.println("Account Number: " + this.AccountNumber);
        System.out.println("Balance: " + this.Balance);
        System.out.println("-----------------------\n");
    }
}

public class Program_30_h {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();  // clear buffer

        Bank_account[] accounts = new Bank_account[n];

        // Creating Accounts
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Account " + (i + 1));

            System.out.print("Enter Holder Name: ");
            String HolderName = sc.nextLine();

            System.out.print("Enter Account Number: ");
            int AccountNumber = sc.nextInt();

            System.out.print("Enter Balance: ");
            double Balance = sc.nextDouble();
            sc.nextLine();  // clear buffer

            accounts[i] = new Bank_account(HolderName, AccountNumber, Balance);
        }

        System.out.println("\nAll accounts created successfully!");

        // Operations Menu
        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Transfer");
            System.out.println("4 - Account Info");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter your Account Number: ");
                int accNo = sc.nextInt();

                Bank_account currentAccount = null;

                // Find Account
                for (int i = 0; i < n; i++) {
                    if (accounts[i].AccountNumber == accNo) {
                        currentAccount = accounts[i];
                        break;
                    }
                }

                if (currentAccount == null) {
                    System.out.println("Account Not Found!");
                    continue;
                }

                switch (choice) {

                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        currentAccount.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        currentAccount.withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.print("Enter receiver Account Number: ");
                        int receiverAccNo = sc.nextInt();

                        Bank_account receiverAccount = null;

                        for (int i = 0; i < n; i++) {
                            if (accounts[i].AccountNumber == receiverAccNo) {
                                receiverAccount = accounts[i];
                                break;
                            }
                        }

                        if (receiverAccount == null) {
                            System.out.println("Receiver Account Not Found!");
                            break;
                        }

                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = sc.nextDouble();
                        currentAccount.transfer(receiverAccount, transferAmount);
                        break;

                    case 4:
                        currentAccount.info();
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Thank you for using the Banking System!");
            } else {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}