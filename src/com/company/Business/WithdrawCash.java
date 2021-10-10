package com.company.Business;

import com.company.Enumerations.TransactionStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class WithdrawCash extends Transaction{

    public WithdrawCash(int transactionId, TransactionStatus status, LocalDateTime transactionDate) {
        super(transactionId, status, transactionDate);
    }

    public boolean isMultipleOf20(int amt) {
        if(amt%20 == 0) {
            return true;
        }

        return false;
    }


}
