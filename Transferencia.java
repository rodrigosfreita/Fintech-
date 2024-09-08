import java.util.Date;

public class Transfer extends Transaction {
    private Account destinationAccount;

    public Transfer(String transactionId, double amount, Date transactionDate, Account sourceAccount, Account destinationAccount, String description) {
        super(transactionId, amount, transactionDate, sourceAccount, description);
        this.destinationAccount = destinationAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public void executeTransfer() {
        if (sourceAccount.getBalance() >= amount) {
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transfer of " + amount + " successfully completed.");
        } else {
            System.out.println("Insufficient balance to complete the transfer.");
        }
    }
}
