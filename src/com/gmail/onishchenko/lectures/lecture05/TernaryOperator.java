package com.gmail.onishchenko.lectures.lecture05;

public class TernaryOperator {
    public static void main(String[] args) {
        int result;
        int a = 40;
        int b = 25;

        result = a > b ? a % 2 == 0 ? 123 : -123 : -1;


        System.out.println(result);
    }
}
