package com.gmail.onishchenko.homework;

public class Sales {
    public static void main(String[] args) {
        int number = 1;
        int days = 5;
        double totalPrice = 12153.41;
        summary(totalPrice, days, number);

        number++;
        days = 7;
        totalPrice = 10486.85;
        summary(totalPrice, days, number);
    }

    private static void summary(double totalPrice, int days, int number) {
        double averagePrice = Math.round(totalPrice / days * 100) / 100.0;
        System.out.printf("Product No %d: smartphone,\n", number);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, totalPrice);
        System.out.println("sales by day is EUR " + averagePrice);
    }
}
