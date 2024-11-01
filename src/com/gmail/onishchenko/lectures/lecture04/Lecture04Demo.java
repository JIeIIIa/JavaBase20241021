package com.gmail.onishchenko.lectures.lecture04;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lecture04Demo {
    public static void main(String[] args) {
//        divideExample();
//        modExample();
//        increment();

//        mathExamples();
//        random();
        formatting();
    }

    private static void formatting() {
        double value = 10.0 / 3;
        System.out.println("value = " + value);

        double result = Math.round( value * 100) / 100.0;
        System.out.println("result = " + result);
        System.out.printf("result = %f", result);

        System.out.printf("Rounded value = %f, calculated value = %05d\n", value, 123 + 10);
        System.out.printf("|%10s | %15s |\n", "row 1", "row 2");
//        System.out.println();
        System.out.printf("|%10d | %15d |\n", 10, 1234);
//        System.out.println();
        System.out.printf("|%10d | %15d |\n", 1084957, 12);

        System.out.println("|     row 1 |           row 2 |");
        System.out.println("|" + 10 + " | " + 1234 + " |");

    }

    private static void random() {
        Random random = new Random();
        int value = random.nextInt();
        System.out.println(value);
        value = random.nextInt();
        System.out.println(value);
        value = random.nextInt();
        System.out.println(value);
        value = random.nextInt(-1_000_000, 20);
        System.out.println(value);
        value = random.nextInt(100);
        System.out.println(value);

        value = ThreadLocalRandom.current().nextInt();
        System.out.println(value);
    }

    public static void mathExamples() {
        long value = 9;
        double result = Math.sqrt(9 * value);
        System.out.println("sqrt(81) = " + result);

        value = 8;
        System.out.println("cbrt(8) = " + Math.cbrt(value));

        value = Math.round(Math.pow(2, 3.5));
        System.out.println("value = " + value);
    }

    private static void increment() {
        int myPrettyLongNameValue = 123;
        myPrettyLongNameValue = myPrettyLongNameValue + 100;
        myPrettyLongNameValue += 100 / 3 - 1;
        System.out.println("myPrettyLongNameValue = " + myPrettyLongNameValue);
        myPrettyLongNameValue += 1;
        myPrettyLongNameValue++;
        System.out.println("myPrettyLongNameValue = " + myPrettyLongNameValue);
        ++myPrettyLongNameValue;
        System.out.println("myPrettyLongNameValue = " + myPrettyLongNameValue);

        myPrettyLongNameValue = 10;
        int result = 3 + ++myPrettyLongNameValue;
//        int result = 3 + myPrettyLongNameValue++;
        System.out.println("result = " + result);

        result = 10;
        result = result++ + --result;
        System.out.println("result = " + result);
    }

    private static void modExample() {
        int a = 10;
        int b = 3;

//        int result = a - b * (a / b);
        int result = a % b;
        System.out.println("10 mod 3 == " + result);
    }

    public static void divideExample() {
        int a = 10;
        int b = 3;

        double result = (double) a / b;
        System.out.println(result);
    }
}
