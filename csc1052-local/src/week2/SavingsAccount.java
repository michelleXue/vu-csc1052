package week2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Initializes a savings account with the specified account number, balance, and
    // interest rate.
    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);  // calls the BankAccount constructor
        this.interestRate = interestRate;
    }

    // Adds interest to this savings account.
    public double addInterest() {
        double interest = getBalance() * interestRate;
        return deposit(interest);
    }

    // Gets a description of this savings account by appending the interest rate to
    // the description from the parent class.
    public String toString() {
        String description = super.toString();  // calls the toString method in BankAccount

        description += String.format("SavingsAccount (earns %3.1f%% interest)", interestRate * 100);

        return description;
    }
}