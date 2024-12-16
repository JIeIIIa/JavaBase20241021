package com.gmail.onishchenko.lectures.lecture14;

public class TriangleRunner {
    public static void main(String[] args) {
        int[] sides = {3, 4, 5};
        Triangle triangle = new Triangle(sides);
        System.out.println(triangle);

        sides[0] = -123456;
        System.out.println(triangle);
    }
}
