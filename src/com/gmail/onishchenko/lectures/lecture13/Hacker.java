package com.gmail.onishchenko.lectures.lecture13;

public class Hacker {
    private BankAccount account;

//    public Hacker() {
//        this.account = null;
//    }

    public Hacker(BankAccount account) {
        this.account = account;
    }

    void hack() {
//        account.amount += -100_000;
        account.addMoney(-100_000);
//        info();
    }

    protected void info() {
        System.out.println("I'm a hacker)");
    }
}
