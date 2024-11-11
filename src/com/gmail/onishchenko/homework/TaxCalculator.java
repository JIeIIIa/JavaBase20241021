package com.gmail.onishchenko.homework;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value: ");
        double value = scanner.nextDouble();

        if (value <= 10_000) {
            double tax = value * 2.5 / 100;
            System.out.println("Your calculated tax is " + tax);
        } else if (value <= 25_000) {
            double tax = value * 4.3 / 100;
            System.out.println("Your calculated tax is " + tax);
        } else {
            double tax = value * 6.7 / 100;
            System.out.println("Your calculated tax is " + tax);
        }
    }
}
