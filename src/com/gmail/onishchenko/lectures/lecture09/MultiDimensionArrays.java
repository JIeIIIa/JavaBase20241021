package com.gmail.onishchenko.lectures.lecture09;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[4][7];

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            print(row);
        }
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println("]");
    }
}
