package oopsjavapractice.practiceproblem.bankaccount;

import java.util.Scanner;

public class BankUtility {
    BankCustomer bankCustomer;

    Scanner sc = new Scanner(System.in);

    public void createAccount() {
        int account_number = (int) (Math.random() * 900000) + 100000;

        System.out.println("Enter Account Holder Name : ");
        String name = sc.next();

        double balance = 50000;

        bankCustomer = new BankCustomer(account_number, name, balance);
        bankCustomer.Bank_AccountNumber++;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount!!");
        }
        else {
            bankCustomer.Bank_Balance += amount;
        }
    }

    public void withdraw (double amount) {
        if (amount > bankCustomer.Bank_Balance) {
            System.out.println("Insufficient Balance !!");
        }

        else {
            bankCustomer.Bank_Balance -= amount;
            System.out.println("Withdrawal of : " + amount + "Successfully");
            System.out.println("Bank Balance is" + bankCustomer.Bank_Balance);
        }
    }

    public void getStatement() {
        System.out.println(bankCustomer.toString());
    }

    public void totalAccounts() {
        System.out.println(bankCustomer.Bank_AccountNumber);
    }
}
