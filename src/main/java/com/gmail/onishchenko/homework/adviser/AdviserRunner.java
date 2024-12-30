package com.gmail.onishchenko.homework.adviser;


import java.util.Scanner;

public class AdviserRunner {
    private static final String EXIT_CODE = "EXIT";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoolAdviser adviser = new CoolAdviser();
        while (true) {
            System.out.print("Enter a day: ");
            String message = scanner.nextLine().toUpperCase();
            if (EXIT_CODE.equals(message)) {
                break;
            } else if (isWrongDay(message)) {
                System.out.println("Please, enter a valid day of week");
            } else {
                Day day = Day.valueOf(message);
                String advise = adviser.advise(day);
                System.out.println("Tip of the day: " + advise);
            }
        }
        System.out.println("Good bye...");
    }

    private static boolean isWrongDay(String message) {
        for (Day day : Day.values()) {
            if (day.name().equals(message)) {
                return false;
            }
        }
        return true;
    }

}
