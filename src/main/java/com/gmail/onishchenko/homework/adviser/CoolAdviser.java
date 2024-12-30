package com.gmail.onishchenko.homework.adviser;

public class CoolAdviser implements Adviser {
    @Override
    public String advise(Day day) {
        return switch (day) {
            case MONDAY, TUESDAY, WENSDAY, THURSDAY -> "Keep calm and focus on the task";
            case FRIDAY -> "Happy Friday;)";
            case SATURDAY, SUNDAY -> "Go to your favorite restaurant or cinema";
        };
    }
}
