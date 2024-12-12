package com.gmail.onishchenko.lectures.lecture13.subpackage;

import com.gmail.onishchenko.lectures.lecture13.BankAccount;
import com.gmail.onishchenko.lectures.lecture13.Hacker;

public class SmartHacker extends Hacker {

    public SmartHacker() {
        super(null);
    }

    public SmartHacker(BankAccount account) {
        super(account);
    }

    public void smartInfo() {
        info();
    }
}
