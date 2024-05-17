/*
 * This class extends BankAccount transactions and uses status
 * of account for withdrawal and deposit operations
 */
public class SavingsAccount extends BankAccount implements Comparable<BankAccount>{

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

    @Override
    public void monthlyProcess() {
        if (super.getNumberOfWithdrawal() > 4) {
            monthlyServiceCharge += (getNumberOfWithdrawal() - 4);
        }
        double balanceAfterServiceCharge = super.getBalance() - monthlyServiceCharge;
        if (balanceAfterServiceCharge < 25) {
            status = false;
        }
    }

    @Override
    public String toString() {
        return "Bank Account Information " +
                "\n   status = " + status +
                "\n   balance = " + String.format("%1.2f", getBalance()) +
                "\n   number of Withdrawals = " + super.getNumberOfWithdrawal() +
                "\n   number of Deposits = " + super.getNumberOfDeposit() +
                "\n   interest rate = " + String.format("%1.2f", super.getAnnualInterestRate()) +
                "\n   service charge = " + String.format("%1.2f", monthlyServiceCharge);

    }

    @Override
    public boolean equals(Object acc) {
        if (acc == this) {
            return true;
        }
        if (acc == null) {
            return false;
        }
        if (acc.getClass() != getClass()) {
            return false;
        }
        return Double.compare(this.getBalance(), getBalance()) == 0;
    }

    @Override
    public int compareTo(BankAccount acc){
        return Double.compare(this.getBalance(), acc.getBalance());
    }
}
