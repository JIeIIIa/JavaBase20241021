package com.gmail.onishchenko.lectures.lecture07;

import java.util.Scanner;

public class Fibonacci {
    // first = 1
    // second = 1
    // 1 1 2 3 5 8 13...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("count == ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        int[] example = {1, 1, 2, 3, 5, 8, 13, 21};

        if(count > 0) {
            numbers[0] = 1;
        }
        if(count > 1) {
            numbers[1] = 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }


        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        System.out.println();

        print(numbers);
    }
















    private static void print(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + "\t");
            i++;
        }
    }
}
