package com.gmail.onishchenko.lectures.lecture05;

public class ConditionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        if (a % 2 == 0) {
            if (b % 2 == 0) {
                System.out.println("00");
            } else {
                System.out.println("Unexpected");
            }
        }
    }
}
