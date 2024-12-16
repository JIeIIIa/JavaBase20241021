package com.gmail.onishchenko.lectures.lecture14;

import static com.gmail.onishchenko.lectures.lecture14.Triangle.EDGE_COUNT;

public class TriangleRunner {
    public static void main(String[] args) {
        System.out.println("Created edges: " + Triangle.Edge.getCreatedInstances());
        int createdEdges = 42;
        int[] sides = {3, 4, 5};
        Triangle.Edge blueEdge = new Triangle.Edge(5, "blue");

        class BoldEdge extends Triangle.Edge {
            public BoldEdge(int length, String color) {
                super(length, color);
            }

//            public void outerVariable() {
//                System.out.println("Outer variable value == " + createdEdges); // local variables referenced from an inner class must be final or effectively final
//            }

            @Override
            public String toString() {
                return "BoldEdge{" + super.toString() + "}";
            }
        }


        BoldEdge boldEdge = new BoldEdge(4, "green");
        Triangle triangle = new Triangle(new Triangle.Edge[]{
                new Triangle.Edge(3, "black"),
                boldEdge,
                blueEdge
        });
        createdEdges += 3;
//        boldEdge.outerVariable();
        System.out.println(triangle);

        sides[0] = -123456;
        System.out.println(triangle);
        System.out.println("Created edges: " + Triangle.Edge.getCreatedInstances());

        Triangle.Edge.outerField();
        System.out.println("Triangle must have " + EDGE_COUNT + " sides");
    }
}
