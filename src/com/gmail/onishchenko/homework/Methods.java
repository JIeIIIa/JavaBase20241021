package com.gmail.onishchenko.homework;

public class Methods {
    public static void main(String[] args) {
        System.out.println(reverseVersion2("Hello World!)"));
    }

    private static int square(int value) {
        return value * value;
    }

    private static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    private static String reverse(String line) {
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            result = line.charAt(i) + result;
        }

        return result;
    }

    private static String reverseVersion2(String line) {
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int rightIndex = chars.length - 1 - i;
            swap(chars, i, rightIndex);
        }

        return new String(chars);
    }

    private static void swap(char[] chars, int i, int rightIndex) {
        char tmp = chars[i];
        chars[i] = chars[rightIndex];
        chars[rightIndex] = tmp;
    }

    private static double power(int base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        if (exponent < 0) {
            return 1.0 / result;
        }else {
            return result;
        }
    }

    private static void print(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}
