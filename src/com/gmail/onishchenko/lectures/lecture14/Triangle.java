package com.gmail.onishchenko.lectures.lecture14;

import java.util.Arrays;

public class Triangle {
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
        private int length;
        private String color;

        public Edge(int length, String color) {
            this.length = length;
            this.color = color;
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
