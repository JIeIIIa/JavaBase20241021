package com.gmail.onishchenko.lectures.lecture14;

import static com.gmail.onishchenko.lectures.lecture14.Triangle.EDGE_COUNT;

public class TriangleRunner {
    public static void main(String[] args) {
        System.out.println("Created edges: " + Triangle.Edge.getCreatedInstances());
        int createdEdges = 0;
        int[] sides = {3, 4, 5};
        Triangle.Edge blueEdge = new Triangle.Edge(5, "blue");
        Triangle triangle = new Triangle(new Triangle.Edge[]{
                new Triangle.Edge(3, "black"),
                new Triangle.Edge(4, "green"),
                blueEdge
        });
        createdEdges += 3;
        System.out.println(triangle);

        sides[0] = -123456;
        System.out.println(triangle);
        System.out.println("Created edges: " + Triangle.Edge.getCreatedInstances());

        Triangle.Edge.outerField();
        System.out.println("Triangle must have " + EDGE_COUNT + " sides");
    }
}
