package com.gmail.onishchenko.lectures.lecture05;

public class ConditionDemo {
    public static void main(String[] args) {
        int a = 11;
        int b = 11;

        System.out.println(" AND ");
        if ((a % 2 == 0) && (b % 2 == 0)) {
            System.out.println("00");
        } else {
            System.out.println("Unexpected");
        }

        System.out.println(" OR ");
        if ((a % 2 == 0) || (b % 2 == 0)) {
            System.out.println("00 or 10 or 01");
        } else {
            System.out.println("Unexpected");
        }
        System.out.println((a % 2 == 0) | (b % 2 == 0) ? "00 or 10 or 01" : "Unexpected");

        System.out.println(" Negotiation");
        if (!((a % 2 == 0) | (b % 2 == 0))) {
            System.out.println("00 or 10 or 01");
        } else {
            System.out.println("Unexpected");
        }

        String line = null;//"qwerty";
        if (line != null && line.length() > 5) {
            System.out.println("Very long line");
        }

        System.out.println("FINISH");

    }
}
