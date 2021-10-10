package com.company.Business;

import com.company.Enumerations.TransactionStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {

    private int transactionId;
    private TransactionStatus status;
    private LocalDateTime transactionDate;

    public Transaction(int transactionId, TransactionStatus status, LocalDateTime transactionDate) {
        this.transactionId = transactionId;
        this.status = status;
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
