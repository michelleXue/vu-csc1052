package week2;

public class BankAccount {
    private long accountNumber;
    private double balance;

    // Initializes a bank account with the specified account number and a balance of 0.
    public BankAccount(long acctNum) {
    	accountNumber = acctNum;
    	balance = 0;
    }

    // Initializes a bank account with the specified account number and balance.
    public BankAccount(long acctNum, double initBalance) {
        accountNumber = acctNum;
        balance = initBalance;
    }

    // Gets the current balance of the bank account.
    public double getBalance() {
        return balance;
    }

    // Deposits the specified amount into this bank account.
    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    // Withdraws the specified amount from this bank account.
    public double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }

    // Gets a description of this bank account.
    public String toString() {
        return String.format("BankAccount %d: $%4.2f", accountNumber, balance);
    }
}