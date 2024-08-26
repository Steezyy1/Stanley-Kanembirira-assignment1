public class Bank {
    // Fields to store the type of account and balance of the account
    private String accountType;
    private double accountBalance;

    // Parameterized constructor to initialize accountType and accountBalance
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to add a deposit amount to the account balance
    public double deposit(double amount) {
        // Check if the deposit amount is positive
        if (amount > 0) {
            accountBalance += amount;
        }
        return accountBalance;
    }

    // Method to withdraw money
    public double withdrawal(double amount) {
        // Check if the withdrawal amount is positive and does not exceed the balance
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
        }
        return accountBalance;
    }

    // Method to display account details
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}

