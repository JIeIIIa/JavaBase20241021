package com.gmail.onishchenko.lectures.lecture13;

public class BankAccount {
    int amount;

    public BankAccount(int amount) {
        this.amount = amount;
    }

    public void addMoney(int value) {
        this.amount += value;
    }

    public void info() {
        System.out.println("I have: " + amount);
    }
}
