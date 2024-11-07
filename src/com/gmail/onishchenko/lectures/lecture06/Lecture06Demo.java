package com.gmail.onishchenko.lectures.lecture06;

import java.util.Scanner;

public class Lecture06Demo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input max value (1..10): ");
//        int bound = scanner.nextInt();
//        forDemo1();
//        forDemo2();
//        forLoopDemo3();
//        whileDemo();
//        doWhileDemo();

        int firstPrice = 12;
        int price2 = 1765;
        int price3 = 22;
        int price4 = 7;

        int[] prices = {32, 54, 65, 23};
        int[] newPrices = prices;

        System.out.println("PRICES: ");
        for (int current : prices) {
            System.out.print(current + "\t");
        }
        System.out.println("\nOld PRICES: ");
        for (int current : newPrices) {
            System.out.print(current + "\t");
        }

        prices[2] = -10000;
        newPrices = new int[]{prices[2]};
//        for (int i = 0; i < prices.length; i++) {
//            newPrices[i] = prices[i];
//        }

        System.out.println("PRICES: ");
        for (int current : prices) {
            System.out.print(current + "\t");
        }
        System.out.println("\nOld PRICES: ");
        for (int current : newPrices) {
            System.out.print(current + "\t");
        }
    }

    private static void doWhileDemo() {
        System.out.println(" DO-WHILE DEMO");
        int i = 1;
        do {
            int j = 1;
            while (j < 11) {
                int value = i * j;
                System.out.printf("%5d", value);
                j++;
            }
            System.out.println();
            i++;
        } while (i < 11);
        System.out.println("Final i == " + i);
    }

    private static void whileDemo() {
        System.out.println(" WHILE DEMO");
        int i = 100;
        while (i < 11) {
            int j = 1;
            while (j < 11) {
                int value = i * j;
                System.out.printf("%5d", value);
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Final i == " + i);
//        System.out.println("Final j == " + j); // error
    }

    private static void forLoopDemo3() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j < 11; j++) {
                int value = i * j;
                System.out.printf("%5d", value);
            }
            System.out.println();
        }
    }

    private static void forDemo2() {
        int j = 0;
        for (int i = 0; i % 4 == 0 && i > 0; i++, j += 10) {

        }

        for (int i = 0; i < 100; i++) {

        }
    }

    private static void forDemo1() {
        int i = 0;
        for (; ; ) {
            if (i > 10) {
                break;
            }
            System.out.println(i);
            i++;
        }


        for (int j = 0; j < 10; j++) {
//            j = 0;
            System.out.println("i == " + i);
            System.out.println(j);
        }
    }
}
