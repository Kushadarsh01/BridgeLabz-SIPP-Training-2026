package oopsjavapractice.practiceproblem.bankaccount;

import java.util.Scanner;

public class BankMenu {
    public void bankDisplay() {
        BankUtility bankUtility = new BankUtility();

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("WELCOME TO SBI BANK");
        System.out.println("--------------------------------------------------------------------------------");

        while (true) {
            System.out.println("1. CREATE ACCOUNT\n2. DEPOSIT\n3. WITHDRAW\n4. GET STATEMENT\n5. GET TOTAL ACCOUNTS\n6. EXIT");
            System.out.println("Enter your choice : ");

            int choice = sc.nextInt();

            if (choice == 6)
                break;

            switch (choice) {
                case 1:
                    bankUtility.createAccount();
                    break;

                case 2:
                    System.out.println("Enter your Deposit Amount : ");
                    double depAmount = sc.nextInt();
                    bankUtility.deposit(depAmount);
                    break;

                case 3:
                    System.out.println("Enter your Withdrawal Amount");
                    double withAmount = sc.nextDouble();
                    bankUtility.withdraw(withAmount);
                    break;

                case 4:
                    bankUtility.getStatement();
                    break;

                case 5:
                    bankUtility.totalAccounts();
                    break;

                default:
                    System.out.println("Invalid Choice!!");
            }
        }
        sc.close();
    }
}
