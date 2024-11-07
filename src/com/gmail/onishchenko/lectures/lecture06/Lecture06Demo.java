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
