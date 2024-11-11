package com.gmail.onishchenko.homework;

public class Sales {
    public static void main(String[] args) {
        int number = 1;
        int days = 5;
        double totalPrice = 12153.41;
        double averagePrice = totalPrice / days;
        System.out.printf("Product No %d: smartphone,\n", number);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, totalPrice);
        System.out.printf("sales by day is EUR %.2f.\n", averagePrice);

        number++;
        days = 7;
        totalPrice = 10486.85;
        averagePrice = totalPrice / days;
        System.out.printf("Product No %d: smartphone,\n", number);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, totalPrice);
        System.out.printf("sales by day is EUR %.2f.\n", averagePrice);
    }
}
