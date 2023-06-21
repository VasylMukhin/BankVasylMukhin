import com.bank.customer.Customer;
import account.BankAccount;
import transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Smith", "123 Main Street");
        Customer customer2 = new Customer("Alice Johnson", "456 Park Avenue");

        BankAccount account1 = new BankAccount(customer1, "1234567890");
        BankAccount account2 = new BankAccount(customer2, "9876543210");

        account1.deposit(1000.0);
        account2.deposit(500.0);

        Transaction transaction = new Transaction(account1, account2, 200.0);

        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}