/* *********************************************************************
*  +-+-+-+-+-+-+-+-+-+-+-+-+-+
*   A P U R V A     A N A N D
*  +-+-+-+-+-+-+-+-+-+-+-+-+-+
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
        // Random class is being used to generate random numbers
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            double balance = rand.nextDouble(0, 50);
            double annualInterestRate = rand.nextDouble(1, 15);

            SavingsAccount account = new SavingsAccount(balance, annualInterestRate);
            randAccount.add(account);
        }

    }
}
