import java.util.Date;

public class Transaction {
    protected String transactionId;
    protected double amount;
    protected Date transactionDate;
    protected Account sourceAccount;
    protected String description;

    public Transaction(String transactionId, double amount, Date transactionDate, Account sourceAccount, String description) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.sourceAccount = sourceAccount;
        this.description = description;
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Date: " + transactionDate);
        System.out.println("Amount: " + amount);
        System.out.println("Description: " + description);
    }
}
