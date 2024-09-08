Bank Account Management System,
This is a simple Java application that simulates a bank account management system. The application allows users to create customers with multiple accounts, perform transactions such as transfers and payments, and view customer details.

Features
Customer Creation: Users can create a customer by providing their name and Social Security Number (SSN).
Account Management: Each customer can have multiple accounts (Checking or Savings), each with an initial balance.
Transactions: The system allows users to:
Display customer information and account balances.
Perform transfers between accounts.
Make payments from an account.
Transaction Details: Each transaction has a unique ID, amount, date, and a description. Transfers and payments are supported as different types of transactions.
Classes
1. Main
This is the entry point of the application. It provides an interactive menu where users can:

Create a customer and add accounts.
Perform transactions like transfers and payments.
View customer and account details.
Key Methods:

main: Handles input and executes the flow of the program based on user selection.
2. Customer
This class represents a bank customer. It contains information about the customer, including their name, SSN, and a list of accounts.

Key Methods:

addAccount: Adds an account to the customer.
findAccountByNumber: Searches for an account by its number.
displayCustomerInformation: Displays the customer's details, including account balances.
3. Account
This class represents a bank account. It stores details such as the account number, balance, type (Checking or Savings), and the owner's name.

Key Methods:

deposit: Increases the balance of the account.
withdraw: Decreases the balance of the account (if sufficient funds are available).
transfer: Transfers funds from one account to another.
displayBalance: Displays the current balance of the account.
4. Transaction
This class is the base class for financial transactions. It holds common transaction information like the transaction ID, amount, date, source account, and a description.

Key Methods:

displayTransactionDetails: Displays the details of a transaction.
5. Transfer
This class represents a transfer between two accounts. It extends the Transaction class and includes the destination account.

Key Methods:

executeTransfer: Executes the transfer by withdrawing funds from the source account and depositing them into the destination account.
6. Payment
This class represents a payment made from an account. It extends the Transaction class.

Key Methods:

makePayment: Executes the payment by withdrawing funds from the account.
Example Usage
The user starts the program by creating a customer and accounts. They can then perform operations such as transfers and payments using the menu options provided.

Sample menu:

1. Display customer information and account balances
2. Make a transfer between accounts
3. Make a payment
4. Exit

How to Run
Ensure you have Java installed on your system.
Compile all Java files.

javac *.java

Run the Main class.

java Main
Requirements
Java 8 or later
Basic understanding of Java OOP concepts (Classes, Inheritance, etc.)
