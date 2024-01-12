import java.util.Scanner;

public class m2q4 {
    private double balance; // Variable to store the account balance

    // Method to start an account with an initial balance
    public void startAccount(double initialBalance) {
        balance = initialBalance;
        System.out.println("Account started with initial balance: $" + initialBalance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into the account.");
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from the account.");
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount + ".");
        }
    }

    // Method to check and display the current account balance
    public void checkBalance() {
        System.out.println("Current account balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create an instance of the Account class
        m2q4 myAccount = new m2q4();

        // Start the account with an initial balance
        myAccount.startAccount(1000);

        // Deposit money into the account
        myAccount.deposit(500);

        // Withdraw money from the account
        myAccount.withdraw(200);

        // Check and display the current account balance
        myAccount.checkBalance();
    }
}
