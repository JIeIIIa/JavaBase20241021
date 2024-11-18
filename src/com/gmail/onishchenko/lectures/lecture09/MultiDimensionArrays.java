package com.gmail.onishchenko.lectures.lecture09;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        matrix[1][3] = 42;
//        matrix[1][13] = -13; // error!

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("--------  CUBE  ---------");
        int[][][] cube = new int[5][3][4];
        for (int i = 0; i < cube.length; i++) {
            System.out.println("Layer #" + i);
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("------  END CUBE  --------");
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println("]");
    }
}
