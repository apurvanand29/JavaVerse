package BankingOperations.src;

/*
 * This class extends BankAccount transactions and uses status
 * of account for withdrawal and deposit operations
 */
public class SavingsAccount extends BankAccount implements Comparable<BankAccount> {

    static boolean status;

    public SavingsAccount(double availableBalance, double annualInterest) {
        super(availableBalance, annualInterest);
        status = super.getBalance() > 25;
    }

}
