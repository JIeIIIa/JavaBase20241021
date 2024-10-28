package com.gmail.onishchenko.lectures.lecture02;

public class Lecture02Demo {
    public static void main(String[] args) {
        /* some
                        comment */
        // boolean flag = false;
        boolean flag = true;

        byte number = 123, digit = 10;
//        byte digit;
        byte count;
        System.out.println("number = " + number);
        number = 127;
        System.out.println("changed number = " + number);
//        number = true;
        System.out.println(digit);

//        number = 123456789;
        int integer = 123456789;

        integer = 19 + digit;
        System.out.println("integer = " + integer);

        integer = integer + 10;
        integer += 10;


        System.out.println("-= INCREMENT =-");
        System.out.println("Initial value: integer = " + integer);
        integer = integer + 1;
        System.out.println("integer = " + integer);
        integer += 1;
        System.out.println("integer = " + integer);
        integer++;
        System.out.println("integer = " + integer);

        number = 127;
        System.out.println("Initial value: number = " + number);
        number++;
        System.out.println("Initial value: number = " + number);
        number--;
        System.out.println("Initial value: number = " + number);

        System.out.println("-= SEVENTEEN =-");
        integer = 17;
        System.out.println(integer);
        integer = 0b10001; // 17;
        System.out.println(integer);
        integer = 0x11;
        System.out.println(integer);
        integer = 021;
        System.out.println(integer);

        long longValue = 123456789012341L;

        System.out.println("-= CHAR =-");
//        char ch = 'A';
//        char ch = 65;
//        char ch = '\u0041';
        char ch  = 0x41;
        System.out.println("ch = " + ch);


        double d = 1234.234;
        float f = 0.1F;

        float result = 10 * f; // 1

        float anotherValue = 0;
        anotherValue += 0.1;
        anotherValue += 0.1;
        anotherValue += 0.1;
        anotherValue += 0.1;
        anotherValue += 0.1;
        anotherValue += 0.1;
        anotherValue += 0.1;
        anotherValue += 0.1;
        anotherValue += 0.1;
        anotherValue += 0.1;

        System.out.println("result = " + result);
        System.out.println("anotherValue = " + anotherValue);

//        integer = digit;
        integer = 128;
        digit = (byte) integer;
        System.out.println("digit = " + digit);

        String line = "I'm a line";
        System.out.println("line = " + line);
        line = line + " :) ";
        System.out.println("line = " + line);
        line = line + (1 + 2 + 3);
        System.out.println("line = " + line);
    }
}
