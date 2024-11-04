package com.gmail.onishchenko.lectures.lecture05;

public class RelationalDemo {
    public static void main(String[] args) {
        int a = 10;
        byte b = -123;

        boolean result = a > b;
        System.out.println("a > b is " + result);
        result = a < b;
        System.out.println("a < b is " + result);

//        result = a <= b;
        result = a >= b;
        System.out.println("a >= b is " + result);

        a = -123;
        result = a == b;
//        result = (boolean) a;
        System.out.println("a == b is " + result);

        result = a != b;
        System.out.println("a != b is " + result);
    }
}
