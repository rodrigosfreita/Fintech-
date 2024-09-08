import java.util.Date;

public class Payment extends Transaction {

    public Payment(String transactionId, double amount, Date transactionDate, Account sourceAccount, String description) {
        super(transactionId, amount, transactionDate, sourceAccount, description);
    }

    public void makePayment() {
        if (sourceAccount.getBalance() >= amount) {
            sourceAccount.withdraw(amount);
            System.out.println("Payment of " + amount + " successfully completed.");
        } else {
            System.out.println("Insufficient balance to complete the payment.");
        }
    }
}
