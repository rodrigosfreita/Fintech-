import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the customer's name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the customer's Social Security Number: ");
        String customerSsn = scanner.nextLine();
        Customer customer = new Customer(customerName, customerSsn);

        while (true) {
            System.out.print("\nEnter the account number (or type 'exit' to finish): ");
            String accountNumber = scanner.nextLine();
            if (accountNumber.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter the initial account balance: ");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the account type (Checking/Savings): ");
            String accountType = scanner.nextLine();
            Account account = new Account(accountNumber, initialBalance, accountType, customerName);
            customer.addAccount(account);
        }

        while (true) {
            System.out.println("\nOperations Menu:");
            System.out.println("1. Display customer information and account balances");
            System.out.println("2. Make a transfer between accounts");
            System.out.println("3. Make a payment");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                customer.displayCustomerInformation();
            } else if (option == 2) {
                System.out.print("\nEnter the source account number: ");
                String sourceAccountNumber = scanner.nextLine();
                Account sourceAccount = customer.findAccountByNumber(sourceAccountNumber);
                System.out.print("Enter the destination account number: ");
                String destinationAccountNumber = scanner.nextLine();
                Account destinationAccount = customer.findAccountByNumber(destinationAccountNumber);
                if (sourceAccount != null && destinationAccount != null) {
                    System.out.print("Enter the amount to be transferred: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine();
                    Transfer transfer = new Transfer("TX" + System.currentTimeMillis(), transferAmount, new Date(), sourceAccount, destinationAccount, "Transfer");
                    transfer.executeTransfer();
                } else {
                    System.out.println("Source or destination account not found.");
                }
            } else if (option == 3) {
                System.out.print("\nEnter the account number to make the payment: ");
                String accountNumber = scanner.nextLine();
                Account account = customer.findAccountByNumber(accountNumber);
                if (account != null) {
                    System.out.print("Enter the payment amount: ");
                    double paymentAmount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the payment description: ");
                    String paymentDescription = scanner.nextLine();
                    Payment payment = new Payment("PG" + System.currentTimeMillis(), paymentAmount, new Date(), account, paymentDescription);
                    payment.makePayment();
                } else {
                    System.out.println("Account not found.");
                }
            } else if (option == 4) {
                System.out.println("Exiting...");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
