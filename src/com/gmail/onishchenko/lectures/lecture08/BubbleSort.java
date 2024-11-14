package com.gmail.onishchenko.lectures.lecture08;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 3, 1, 6, 7, 2}; // {1, 2, 3, 6, 7, 10}
//        int[] array = {1, 2, 3, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        print(array);

        int steps = 0;
        boolean sorted = false;
        for (int j = 0; j < array.length; j++) {
            if (sorted) {
               break;
            }
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                steps++;
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false;
                }
            }
            System.out.print("Step #" + j + ": ");
            print(array);
        }
        System.out.println();
        System.out.println("Total steps: " + steps);


        print(array);

    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println("]");
    }


}
