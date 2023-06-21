package transaction;

import account.BankAccount;

public class Transaction {
    private BankAccount sourceAccount;
    private BankAccount targetAccount;
    private double amount;

    public Transaction(BankAccount sourceAccount, BankAccount targetAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.amount = amount;
    }

}