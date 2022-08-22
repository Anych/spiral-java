package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[] arr = new int[rows * columns];
        int count = 1;
        for (int i = 0; i < rows * columns; i++) {
            arr[i] = count++;
        }

        int[][] mat = new int[rows][columns];

        int top = 0, bottom = rows - 1;
        int left = 0, right = columns - 1;

        int index = 0;

        while (true)
        {
            if (left > right) {
                break;
            }

            for (int i = left; i <= right; i++) {
                mat[top][i] = arr[index++];
            }
            top++;

            if (top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                mat[i][right] = arr[index++];
            }
            right--;

            if (left > right) {
                break;
            }

            for (int i = right; i >= left; i--) {
                mat[bottom][i] = arr[index++];
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                mat[i][left] = arr[index++];
            }
            left++;
        }
        return mat;
    }
}
