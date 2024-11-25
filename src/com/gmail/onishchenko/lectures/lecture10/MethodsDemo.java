package com.gmail.onishchenko.lectures.lecture10;

public class MethodsDemo {
    public static void main(String[] args) {
//        2*x + 4 == 0;
//        x == -4 / 2;
//

        System.out.println("2 * x + 4 == 0");
        System.out.println("x == " + findRoot(2, 4));

        System.out.println("-12 * x + 42 == 0");
        System.out.println("x == " + findRoot(-12, 42));
        System.out.println("x - 42 == 0");
        System.out.println("x == " + findRoot(-42));

        System.out.println("-= PRINT METHOD =-");
        String[] lines = {"", "foo", "", "bar"};

        print(lines);

        stringDemo();
    }

    public static void print(String[] lines) {
        if ("".equals(lines[0])) {
            System.out.println("Have to finish");
            return;
        } else {
            for (int i = 0; i < lines.length; i++) {
                System.out.println(lines[i]);
            }
        }
    }

    /**
     * a * x + b == 0;
     */
    public static double findRoot(double a, double b) {
        return -b / a;
    }

    public static double findRoot(int a, double b) {
        return -b / a;
    }

//    public static double findRoot(double a, int b) {
//        return -b / a;
//    }

    // missing return statement
//    public static double findRoot(int a, int b) {
//        if (a == 0) {
//            return 0;
//        }
////        return -b / (double) a;
//        double result = - b / (double) a;
//    }

//    public static float findRoot(double a, double b) {
//        return (float) (-b / a);
//    }

//    public static double findRoot(double firstArgument, double secondArgument) {
//        return -firstArgument / secondArgument;
//    }

    /**
     * x + b == 0;
     */
    public static double findRoot(double b) {
        return -b;
    }

    public static void stringDemo() {
        String line = "abcdrfg";
        System.out.println("Length of line " + line.length());
        char ch = line.charAt(2);
        System.out.println("Char at position 3: " + ch);
        char[] charArray = line.toCharArray();
        System.out.println("Char at position 3: " + charArray[2]);
    }
}
