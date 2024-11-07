package com.gmail.onishchenko.lectures.lecture06;

import java.util.Scanner;

public class Lecture06Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input max value (1..10): ");
        int bound = scanner.nextInt();
        if (bound >= 1) {
            System.out.println(1);
        }
        if (bound >= 2) {
            System.out.println(2);
        }
        if (bound >= 3) {
            System.out.println(3);
        }
        if (bound >= 4) {
            System.out.println(4);
        }
        if (bound >= 5) {
            System.out.println(5);
        }
        if (bound >= 6) {
            System.out.println(6);
        }
        if (bound >= 7) {
            System.out.println(7);
        }
        if (bound >= 8) {
            System.out.println(8);
        }
        if (bound >= 9) {
            System.out.println(9);
        }
        if (bound == 10) {
            System.out.println(10);
        }
    }
}
