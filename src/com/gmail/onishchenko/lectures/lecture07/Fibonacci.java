package com.gmail.onishchenko.lectures.lecture07;

import java.util.Scanner;

public class Fibonacci {
    // first = 1
    // second = 1
    // 1 1 2 3 5 8 13...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("count == ");
//        int count = scanner.nextInt();
        int count = 10;
        int[] numbers = new int[count];
        int[] example = {1, 1, 2, 3, 5, 8, 13, 21};

        if (count > 0) {
            numbers[0] = 1;
        }
        if (count > 1) {
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
        System.out.println("\nConstant array:");
        print(new int[]{1, 2, 3, 4, 5});

        System.out.println("\n-= Cloned array =-");
        int[] clonedNumbers = new int[1];
        print(clonedNumbers);
        clonedNumbers = numbers;
        print(clonedNumbers);
        numbers[3] = -12345;
        System.out.print("Numbers: ");
        print(numbers);
        System.out.print("Cloned : ");
        print(clonedNumbers);
    }


    private static void print(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + "\t");
            i++;
        }
        System.out.println();
    }
}
