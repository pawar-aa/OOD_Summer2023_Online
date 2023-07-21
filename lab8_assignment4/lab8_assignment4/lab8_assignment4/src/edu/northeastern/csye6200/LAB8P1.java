// Author: Aashay Pawar
// NUID: 002134382
// Date: 2023-07-21
// Description: Problem 1

package edu.northeastern.csye6200;

import java.util.Random;
import java.util.Scanner;

public class LAB8P1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns for the matrix
        System.out.print("Enter the number of rows: ");
        int nRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int nCols = scanner.nextInt();

        // Generate a random matrix with the specified number of rows and columns
        int[][] nMatrix = funGenerateRandomMatrix(nRows, nCols);

        // Print the generated matrix
        funPrintMatrix(nMatrix);

        // Find the index of the row with the largest sum of elements
        int nLargestRow = funFindLargestRow(nMatrix);

        // Find the index of the column with the largest sum of elements
        int nLargestCol = funFindLargestCol(nMatrix);

        // Print the index of the row and column with the largest sums
        System.out.println("The index of the largest row: " + nLargestRow);
        System.out.println("The index of the largest column: " + nLargestCol);
    }

    // Generate a random matrix with the specified number of rows and columns
    public static int[][] funGenerateRandomMatrix(int rows, int cols) {
        int[][] nMatrix = new int[rows][cols];
        Random nRandom = new Random();

        // Fill the matrix with random numbers between 0 and 9
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nMatrix[i][j] = nRandom.nextInt(10); // Random number between 0 and 9
            }
        }

        return nMatrix;
    }

    // Print the given matrix
    public static void funPrintMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    // Calculate the sum of elements in a given row
    public static int funSumRow(int row[]) {
        int s = 0;
        for (int n : row) {
            s += n;
        }
        return s;
    }

    // Calculate the sum of elements in a given column of the matrix
    public static int funSumCol(int matrix[][], int col) {
        int s = 0;
        for (int i = 0; i < matrix.length; i++) {
            s += matrix[i][col];
        }
        return s;
    }

    // Find the index of the row with the largest sum of elements
    public static int funFindLargestRow(int[][] matrix) {
        int maxS = Integer.MIN_VALUE;
        int maxR = 0;

        // Iterate through each row and calculate its sum, keeping track of the row index with the largest sum
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = funSumRow(matrix[i]);
            if (rowSum > maxS) {
                maxS = rowSum;
                maxR = i;
            }
        }

        return maxR;
    }

    // Find the index of the column with the largest sum of elements
    public static int funFindLargestCol(int[][] matrix) {
        int maxS = Integer.MIN_VALUE;
        int maxC = 0;

        // Iterate through each column and calculate its sum, keeping track of the column index with the largest sum
        for (int i = 0; i < matrix[0].length; i++) {
            int columnSum = funSumCol(matrix, i);
            if (columnSum > maxS) {
                maxS = columnSum;
                maxC = i;
            }
        }

        return maxC;
    }
}