package com.company.Business;

import java.time.YearMonth;

public class ATM {

    private String atmId;
    private String location;
    private double availableBalance;

    public ATM(String atmId, String location, double availableBalance) {
        this.atmId = atmId;
        this.location = location;
        this.availableBalance = availableBalance;
    }

    public String getAtmId() {
        return atmId;
    }

    public void setAtmId(String atmId) {
        this.atmId = atmId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public boolean checkCardExpiry(Card card) {
        if(card.getExpiryDate().isBefore(YearMonth.now())) {
            return false;
        }
        return true;
    }
    public boolean authenticateUser(Card card, String pin) {

         if(!card.getPin().equals(pin)) {
            return false;
        }
        return true;
    }

    public boolean validateAmt(int amt) {
        if(amt < availableBalance) {
            return true;
        }

        return false;
    }
}
