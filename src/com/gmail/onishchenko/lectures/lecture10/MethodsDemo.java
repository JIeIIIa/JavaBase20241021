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
    }

    /**
     * a * x + b == 0;
    * */
    public static double findRoot(double a, double b) {
        return -b / a;
    }

    public static double findRoot(int a, double b) {
        return -b / a;
    }

//    public static double findRoot(double a, int b) {
//        return -b / a;
//    }

//    public static double findRoot(int a, int b) {
//        return -b / (double) a;
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
}
