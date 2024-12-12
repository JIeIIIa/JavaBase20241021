package com.gmail.onishchenko.lectures.lecture13;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(42000);
        account.info();

        account.addMoney(-100000);
        account.info();
        boolean blocked = account.isBlocked();
        System.out.println("Account is blocked: " + blocked);

        System.out.println("-= Hack account =-");
        Hacker hacker = new Hacker(account);
        hacker.info();
        hacker.hack();
        account.info();

        System.out.println("-= OBJECT CLASS =-");
        System.out.println(account);

        BankAccount anotherAccount = new BankAccount(42_000);
//        anotherAccount = account;
        if (account.equals(anotherAccount)) {
            System.out.println("Accounts have the same amounts");
        } else {
            System.out.println("Not equals");
        }
    }
}
