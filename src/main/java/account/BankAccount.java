package account;

import com.bank.customer.Customer;

public class BankAccount {
    private Customer name;
    private String accountNumber;
    private double balance;

    public BankAccount(Customer name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Niewystarczające środki na koncie");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Numer konta: " + accountNumber);
        System.out.println("Saldo: " + balance);
    }
}