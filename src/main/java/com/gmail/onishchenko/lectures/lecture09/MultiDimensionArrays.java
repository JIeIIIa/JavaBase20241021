package com.gmail.onishchenko.lectures.lecture09;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        System.out.print("Income args: ");
        printString(args);


        int[][] matrix = new int[4][];

        matrix[0] = new int[]{1, 2, 3, 1, 2};
        matrix[1] = new int[]{5, 6, 7, 8};
        matrix[2] = new int[0];
        ;
        matrix[1][3] = 42;
//        matrix[1][13] = -13; // error!


        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) {
                continue;
            }
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("]");
        }

//        cubeDemo();
    }

    private static void cubeDemo() {
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

    public static void printString(String[] array) {
        System.out.print("[");
        for (String line : array) {
            System.out.print(line + "\t");
        }
        System.out.println("]");
    }
}
