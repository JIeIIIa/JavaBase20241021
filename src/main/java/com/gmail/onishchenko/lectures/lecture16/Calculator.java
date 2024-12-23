package com.gmail.onishchenko.lectures.lecture16;

public class Calculator {

    // n! = 1 * 2 * ... * (n - 1) * n
    public long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
