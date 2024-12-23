package com.gmail.onishchenko.lectures.lecture05;

public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 10;             // 1010
        int b = 3;              // 0011

        int result = a & b;     // 0010 == 2
        System.out.println("10 & 3 == " + result);

        result = a | b;         // 1011 == 11
        System.out.println("10 | 3 == " + result);

        a = 1;                  // 000000..001
        result = ~a;            // 111111..110
        System.out.println(result);

        a = 10;                 // 01010
        result = a << 1;        // 10100 == 20
        System.out.println("10 << 1 == " + result);

        a = 10;                 // 01010
        result = a >> 2;        // 00010 = 2
        System.out.println("10 >> 2 == " + result);

        a = 0b10000000000000000000000000000000;
        System.out.println("a == " + a);
        result = a >> 1; // 11000000000000000000000000000000
        System.out.println("10000000000000000000000000000000 >> 1 == " + result);

        result = a >>> 1; // 01000000000000000000000000000000
        System.out.println("10000000000000000000000000000000 >>> 1 == " + result);
    }
}
