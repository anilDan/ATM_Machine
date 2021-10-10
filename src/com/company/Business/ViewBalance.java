package com.company.Business;

import com.company.Enumerations.TransactionStatus;

import java.time.LocalDateTime;

public class ViewBalance extends Transaction{

    public ViewBalance(int transactionId, TransactionStatus status, LocalDateTime transactionDate) {
        super(transactionId, status, transactionDate);
    }

    public void checkBalance() {


    }
}
