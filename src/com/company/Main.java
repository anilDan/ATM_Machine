package com.company;

import com.company.Business.*;
import com.company.Enumerations.AccountStatus;
import com.company.Enumerations.TransactionStatus;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// Initialize Data

        Card card = new Card("1234 5678 1234 5678", "ABCDEF XYZ", YearMonth.now().plusYears(4), "1234");
        Account account = new Account(1234567890, 50000.00, 5000.00, AccountStatus.ACTIVE, card);
        Customer customer = new Customer("ABCDEF XYZ", "9876543210", "abc@xyz.com", "QWERTY LANE, MA 02120", card, account);
        int tid = 1;

        ATM atm = new ATM("1", "NH3032", 10000000);

        Scanner input = new Scanner(System.in);
        System.out.println("__________________________________________________");
        System.out.println("|           Welcome to New Bank ATM              |");
        System.out.println("__________________________________________________");
        System.out.print("Please insert the card and enter PIN: ");
        String enteredPin = input.next();

        int retries = 0;
        boolean userAuthenticated = atm.authenticateUser(card, enteredPin);
        while(!userAuthenticated && retries < 5) {
            System.out.print("Invalid PIN, please enter a valid PIN: ");
            enteredPin = input.next();
            userAuthenticated = atm.authenticateUser(card, enteredPin);
            retries++;
        }

        if(!userAuthenticated) {
            System.out.println("Number of retries reached. Please try again later!!!");
            System.out.println("Thank you for using New Bank ATM, Bye.");
            System.exit(0);
        }


        boolean option = true;
        while(option) {
            System.out.println("__________________________________________________");
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");
            System.out.println("__________________________________________________");
            System.out.println("Please select an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Transaction vb = new ViewBalance(tid++, TransactionStatus.CREATED, LocalDateTime.now());
                    System.out.println("*************************************");
                    System.out.println("Account Balance: $" + account.getBalance() + "\n");
                    System.out.println("*************************************");
                    vb.setStatus(TransactionStatus.SUCCESS);

                    break;

                case 2:
                    System.out.println("Please enter the amount: ");
                    double withdrawAmount = input.nextDouble();
                    Transaction wc = new WithdrawCash(tid++, TransactionStatus.CREATED, LocalDateTime.now());
                    if(account.validateWithdrawalAmount(withdrawAmount)) {
                        account.executeCashWithdraw(wc, withdrawAmount);
                        wc.setStatus(TransactionStatus.SUCCESS);
                        System.out.println("__________________________________________________");
                        System.out.println("Please collect the cash");
                        System.out.println("==================================================");

                    } else {
                        wc.setStatus(TransactionStatus.FAIL);
                        System.out.println("Transaction Failed : Invalid Amount");
                        System.out.println("==================================================");
                    }
                    break;

                case 3:
                    System.out.println("Please enter the amount to be deposited and insert Cash :");
                    double depositCash = input.nextDouble();
                    Transaction dc = new DepositCash(tid++, TransactionStatus.CREATED, LocalDateTime.now());
                    account.executeCashDeposit(dc, depositCash);
                    dc.setStatus(TransactionStatus.SUCCESS);
                    System.out.println("__________________________________________________");
                    System.out.println("Cash has been deposited successfully");
                    System.out.println("Account Balance: $" + account.getBalance());
                    System.out.println("==================================================");
                    break;

                case 4:
                    System.out.println("Thank you for using New Bank ATM, Bye.");
                    System.exit(0);

                default:
                    System.out.println("\n" + "Invalid choice." + "\n");
                    System.out.println("==================================================");
            }

            System.out.println("Do you want to continue? Enter 1 for Yes or 0 for No: ");
            int ip = input.nextInt();
            if(ip == 1) {
                option = true;
            } else if(ip == 0) {
                System.out.println("Thank you for using New Bank ATM, Bye.");
                System.exit(0);
            } else {
                System.out.println("Invalid option");
                System.out.println("Thank you for using New Bank ATM, Bye.");
                System.exit(0);
            }

        }

    }
}
