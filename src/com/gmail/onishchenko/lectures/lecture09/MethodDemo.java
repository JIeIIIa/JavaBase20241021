package com.gmail.onishchenko.lectures.lecture09;

public class MethodDemo {
    public static void main(String[] args) {
        int year = 2024;
        int[] report = prepareReport(year);
        System.out.println("Year from main == " + year);

//        prepareReport(2023);
//        prepareReport(2022);
//        prepareReport(2021);
    }

    public static int[] prepareReport(int year) {
        System.out.println("Year from prepareReport == " + year);
        year = 1000;
        System.out.printf("Build report [year == %d]\n", year);

        if (true) {
            int[] result = {1, 2, 3};
            return result;
        }
        return new int[0];
//        System.out.println("unreachable statement");
    }
}
