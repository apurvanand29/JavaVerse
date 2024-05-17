package BankingOperations.src;

/*This abstract class has non-abstract methods to handle deposit, withdrawal, 
*interest calculation and monthly process */

public abstract class BankAccount {

    private double balance, annualInterestRate;
    private int numberOfDeposit = 0, numberOfWithdrawal = 0;
    protected double monthlyServiceCharge;

    // Constructor accepting balance and annual interest rate
    public BankAccount(double availableBalance, double annualInterest) {
        this.balance = availableBalance;
        this.annualInterestRate = annualInterest;
    }

}
