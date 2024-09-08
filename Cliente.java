import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String socialSecurityNumber;
    private List<Account> accounts;

    public Customer(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.accounts = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public Account findAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void displayCustomerInformation() {
        System.out.println("Name: " + name);
        System.out.println("Social Security Number: " + socialSecurityNumber);
        System.out.println("Accounts: ");
        for (Account account : accounts) {
            System.out.println(" - Account " + account.getAccountNumber() + ": " + account.getBalance());
        }
    }
}
