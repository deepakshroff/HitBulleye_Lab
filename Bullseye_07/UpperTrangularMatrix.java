package Bullseye_07;

import java.util.Scanner;

public class UpperTrangularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows/columns for the square matrix: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Upper Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
