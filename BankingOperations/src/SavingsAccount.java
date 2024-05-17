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

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() < amount)
            System.exit(0);

        if (super.getBalance() < 25) {
            status = false;
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (super.getBalance() > 25) {
            status = true;
        }
    }

}
