package com.gmail.onishchenko.lectures.lecture14;

public interface EmailSender {
    void print();
    default void consolePrint() {
        System.out.println("Unexpected operation");
    }
}
