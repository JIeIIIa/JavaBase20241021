package com.gmail.onishchenko.lectures.lecture14;


@FunctionalInterface
public interface Printable {
    public static final String DEFAULT_MESSAGE = "default message";

    void print();
//    void anotherMethod();
    default void consolePrint() {
        System.out.println(DEFAULT_MESSAGE);
    }
}
