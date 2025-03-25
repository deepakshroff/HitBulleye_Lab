package Bullseye_07;

import java.util.Scanner;

public class sumEachColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

    
        System.out.println("Sum of each column:");
        for (int j = 0; j < cols; j++) {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) {
                columnSum += array[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + columnSum);
        }

        scanner.close();
    }
}
