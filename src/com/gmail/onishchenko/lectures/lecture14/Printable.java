package com.gmail.onishchenko.lectures.lecture14;


@FunctionalInterface
public interface Printable {
    void print();
//    void anotherMethod();
    default void consolePrint() {
        System.out.println("default message");
    }
}
