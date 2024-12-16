package com.gmail.onishchenko.lectures.lecture14;

import java.util.Arrays;

public class Triangle {
    public static final int EDGE_COUNT = 3;
    private Edge[] edges;

    public Triangle(Edge[] edges) {
        this.edges = Arrays.copyOf(edges, edges.length);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edges=" + Arrays.toString(edges) +
                '}';
    }

    public static class Edge {
        private static int createdInstances = 0;
        private int length;
        private String color;

        public Edge(int length, String color) {
            createdInstances++;
            this.length = length;
            this.color = color;
        }

        public static int getCreatedInstances() {
            return createdInstances;
        }

        public static void outerField() {
            System.out.println("Triangle must have " + EDGE_COUNT + " sides");
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "length=" + length +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
