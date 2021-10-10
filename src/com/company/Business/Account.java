package com.company.Business;

import com.company.Enumerations.AccountStatus;

import java.util.ArrayList;

public class Account {

    private long accountNumber;
    private double balance;
    private double withdrawalLimit;
    private AccountStatus status;
    private Card card;

    public Account(long accountNumber, double balance, double withdrawalLimit, AccountStatus status, Card card) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
        this.status = status;
        this.card = card;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public boolean validateWithdrawalAmount(double amt) {
        if(amt <= balance && amt <= withdrawalLimit) {
            return true;
        }

        return false;
    }

    public void executeCashWithdraw(Transaction wc, double amt) {
        setBalance(balance - amt);
        setWithdrawalLimit(withdrawalLimit - amt);
    }

    public void executeCashDeposit(Transaction dc, double amt) {
        setBalance(balance + amt);
    }
}
