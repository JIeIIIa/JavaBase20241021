package com.gmail.onishchenko.lectures.lecture05;

public class ForrestGump {
    public static void main(String[] args) {
        int dangerLevel = 25;

        if (dangerLevel < 20) {
            System.out.print("All");
            System.out.print(" OK)");
        } else if (dangerLevel < 50) {
            System.out.println("Run, Forrest, run!");
            int hiddenValue = 42;
        } else {
            System.out.println("DANGER!!! RUUUUN!!!");
//            System.out.println(hiddenValue); // error
        } /*else {

        }*/

//        System.out.println(hiddenValue); // error

    }
}
