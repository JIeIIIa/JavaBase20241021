package com.gmail.onishchenko.lectures.lecture16;

public class Calculator {

    // n! = 1 * 2 * ... * (n - 1) * n == (n - 1)! * n
    public long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        boolean flag = false;
        if (flag) {
            System.out.println("");
        }
        return factorial(n - 1) * n;
    }
}
