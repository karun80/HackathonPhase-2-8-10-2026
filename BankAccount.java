import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(int number, String name, double bal) {
        accountNumber = number;
        accountHolderName = name;
        balance = bal;
    }

    // Deposit
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Check Balance
    double checkBalance() {
        return balance;
    }

    // Display
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.next();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount b = new BankAccount(number, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        b.deposit(deposit);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();
        b.withdraw(withdraw);

        System.out.println("\nFinal Account Details:");
        b.displayAccount();
    }
}