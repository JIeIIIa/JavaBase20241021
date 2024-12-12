package com.gmail.onishchenko.lectures.lecture13;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(42000);
        account.info();

        account.amount += 1000;
        account.info();
    }
}
