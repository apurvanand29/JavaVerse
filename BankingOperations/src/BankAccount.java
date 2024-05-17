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

    // Accessors and Mutators for all private data members
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberOfWithdrawal() {
        return numberOfWithdrawal;
    }

    public int getNumberOfDeposit() {
        return numberOfDeposit;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumberOfWithdrawal(int numberOfWithdrawal) {
        this.numberOfWithdrawal = numberOfWithdrawal;
    }

    public void setNumberOfDeposit(int numberOfDeposit) {
        this.numberOfDeposit = numberOfDeposit;
    }

    /**
     * This method will help you deposit and update
     * available balance and increment number of deposit
     * 
     * @param depositAmount
     */
    public void deposit(double depositAmount) {
        this.balance = balance + depositAmount;
        this.numberOfDeposit++;
    }

    /**
     * This method will help you withdraw and update
     * available balance and increment number of withdraw
     * 
     * @param withdrawalAmount
     */
    public void withdraw(double withdrawalAmount) {
        this.balance = balance - withdrawalAmount;
        this.numberOfWithdrawal++;
    }

    /**
     * This method will help you calculate interest and update
     * available balance
     * 
     */
    public void calcInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        this.balance = balance + monthlyInterest;
    }

    /**
     * This method will help you with monthly process
     */
    public void monthlyProcess() {
        this.balance = balance - monthlyServiceCharge;
        calcInterest();
        this.numberOfDeposit = 0;
        this.numberOfWithdrawal = 0;
        this.monthlyServiceCharge = 0;
    }
}
