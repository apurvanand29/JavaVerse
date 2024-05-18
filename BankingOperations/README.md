# Bank Account System

## Overview
This Java project demonstrates a basic banking system using abstract classes, inheritance, and polymorphism. It includes two main classes: `BankAccount` and `SavingsAccount`.


### BankAccount Class
The `BankAccount` class is an abstract class that provides methods for handling basic banking operations such as deposit, withdrawal, interest calculation, and monthly processing.

#### Methods:
- `deposit(double depositAmount)`: Adds funds to the account.
- `withdraw(double withdrawalAmount)`: Subtracts funds from the account, provided sufficient balance.
- `calcInterest()`: Calculates monthly interest based on the annual interest rate.
- `monthlyProcess()`: Processes monthly activities including deducting service charges and updating balances.

### SavingsAccount Class
The `SavingsAccount` class extends `BankAccount` and adds specific behavior for a savings account, including maintaining a status based on balance thresholds and limiting withdrawals.

#### Additional Features:
- Limits withdrawals to ensure minimum balance requirements.
- Overrides `monthlyProcess()` to enforce transaction limits and apply service charges.

### Bank Class
The `Bank` class contains a `main` method demonstrating the functionality of `SavingsAccount` by creating multiple accounts with random balances and interest rates, performing transactions, and displaying account details.

## Usage
To use this project:
1. Compile the Java files (`BankAccount.java`, `SavingsAccount.java`, and `Bank.java`).
2. Run the `Bank` class to simulate banking operations on randomly generated `SavingsAccount` instances.

## Example Output
Upon running `Bank.main()`, you will see detailed information about each `SavingsAccount`, including its balance, transaction history, interest rate, and service charges.
