package com.gmail.onishchenko.lectures.lecture14;

import java.util.Arrays;

public class Triangle {
    private int[] sides;

    public Triangle(int[] sides) {
        this.sides = Arrays.copyOf(sides, sides.length);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }
}
