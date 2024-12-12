package com.gmail.onishchenko.lectures.lecture13;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(42000);
        account.info();

        account.addMoney(-100000);
        account.info();

        System.out.println("-= Hack account =-");
        Hacker hacker = new Hacker(account);
        hacker.info();
        hacker.hack();
        account.info();
    }
}
