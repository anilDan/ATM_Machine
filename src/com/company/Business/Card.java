package com.company.Business;

import java.time.YearMonth;

public class Card {

    private String cardNumber;
    private String customerName;
    private YearMonth expiryDate;
    private String pin;

    public Card(String cardNumber, String customerName, YearMonth expiryDate, String pin) {
        this.cardNumber = cardNumber;
        this.customerName = customerName;
        this.expiryDate = expiryDate;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public YearMonth getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(YearMonth expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
