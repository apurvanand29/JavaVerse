/* *********************************************************************
*  +-+-+-+-+-+-+-+-+-+-+-+-+-+
*   A P U R V A     A N A N D
*  +-+-+-+-+-+-+-+-+-+-+-+-+-+
* 
* ITMD-510-05
* Date: 09/19/2023
*
* Assignment: Week 4 Exercise 10.1
* 
* Description: This will help you understand the concept of overriding
*              and abstract class through a banking application
*
***********************************************************************
*/

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    public static void main(String[] args) throws Exception {
        ArrayList<SavingsAccount> randAccount = new ArrayList<>();

        // To generate random values and store in SavingsAccount object
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            double balance = rand.nextDouble(0, 50);
            double annualInterestRate = rand.nextDouble(1, 15);

            SavingsAccount account = new SavingsAccount(balance, annualInterestRate);
            randAccount.add(account);
        }

        /*
         * To generate random amount for deposit and withdrawal for each SavingsAccount
         * and print object
         */
        for (SavingsAccount account : randAccount) {
            account.deposit(rand.nextDouble());
            account.withdraw(rand.nextDouble());
            account.monthlyServiceCharge = rand.nextDouble();
            account.monthlyProcess();
            System.out.println(account.toString());
        }

    }
}
