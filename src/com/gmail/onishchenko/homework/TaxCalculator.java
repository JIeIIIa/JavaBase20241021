package com.gmail.onishchenko.homework;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value: ");
        double value = scanner.nextDouble();

        double taxRate;
        if (value <= 10_000) {
            taxRate = 2.5;
        } else if (value <= 25_000) {
            taxRate = 4.3;
        } else {
            taxRate = 6.7;
        }

        double tax = value * taxRate / 100;
        System.out.println("Your calculated tax is " + tax);
    }
}
