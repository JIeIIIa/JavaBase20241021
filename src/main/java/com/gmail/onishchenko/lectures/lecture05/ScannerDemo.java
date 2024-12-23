package com.gmail.onishchenko.lectures.lecture05;


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        com.gmail.onishchenko.lectures.lecture05.subpackage.Scanner myScanner = new com.gmail.onishchenko.lectures.lecture05.subpackage.Scanner();
        System.out.println("Enter a value (0-9): ");
        int value = scanner.nextInt();
        System.out.println("Entered value == " + value);
//        scanner.nextLine();
        int anotherValue = scanner.nextInt();
        System.out.println("anotherValue = " + anotherValue);
        System.out.println("Enter a string value: ");
        String line = scanner.nextLine();
        System.out.printf("Line == '%s'\n", line);
    }
}
