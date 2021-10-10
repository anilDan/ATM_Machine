package com.company.Business;

import com.company.Enumerations.TransactionStatus;

import java.time.LocalDateTime;

public class DepositCash extends Transaction{

    public DepositCash(int transactionId, TransactionStatus status, LocalDateTime transactionDate) {
        super(transactionId, status, transactionDate);
    }
}
