package com.gmail.onishchenko.lectures.lecture05;

public class SwitchDemo {
    public static void main(String[] args) {
        int value = -1;

        if (value == 0 || value == -1) {
            System.out.println("ZERO OR LESS");
        } else if (value == 1) {
            System.out.println("ONE");
        } else if (value == 2) {
            System.out.println("TWO");
        } else {
            System.out.println("Unknown value");
        }

        switch (value) {
            case -1:
            case 0:
                System.out.print("ZERO");
                System.out.println(" OR LESS");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            default:
                System.out.println("Unknown value");
                break;
        }

        switch (value) {
            case 1 -> {
                System.out.print("ZERO");
                System.out.print(" OR LESS");
            }
            case 2 -> System.out.println("ONE");
            case 3 -> System.out.println("TWO");
            default -> System.out.println("Unknown value");
        }

        System.out.println("FINISH");
    }
}
