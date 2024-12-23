package com.gmail.onishchenko.lectures.lecture13.subpackage;

import com.gmail.onishchenko.lectures.lecture13.Hacker;

public class HackerRunner {
    public static void main(String[] args) {
        Hacker hacker = new Hacker(null);
//        hacker.hack(); // hack() has a package-private access
//        hacker.info(); // hack() has a package-private access
    }
}
