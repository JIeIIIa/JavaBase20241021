package com.gmail.onishchenko.lectures.lecture14;

public class TriangleRunner {
    public static void main(String[] args) {
        int[] sides = {3, 4, 5};
        Triangle triangle = new Triangle(new Triangle.Edge[]{
                new Triangle.Edge(3, "black"),
                new Triangle.Edge(4, "green"),
                new Triangle.Edge(5, "blue")
        });
        System.out.println(triangle);

        sides[0] = -123456;
        System.out.println(triangle);
    }
}
