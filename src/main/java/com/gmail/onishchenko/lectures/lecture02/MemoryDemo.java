package com.gmail.onishchenko.lectures.lecture02;

public class MemoryDemo {
    public static void main(String[] args) {
        int a = 10;
        a += 10;
        int b = -1;
        b = a * b;

        MemoryDemo demo = new MemoryDemo();

        System.out.println("result = " + b);
        myMethod();
        System.out.println("THE END");
    }

    public static void myMethod() {
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
    }
}
