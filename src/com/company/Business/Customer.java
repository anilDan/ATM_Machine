package com.company.Business;

import com.company.Enumerations.AccountStatus;

public class Customer {

    private String name;
    private String phone;
    private String email;
    private String address;

    private Card card;
    private Account account;

    public Customer(String name, String phone, String email, String address, Card card, Account account) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.card = card;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean createTransaction(Transaction transaction) {

        return true;
    }
}
