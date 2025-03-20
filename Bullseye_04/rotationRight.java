package Bullseye_04;

import java.util.Scanner;

public class rotationRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

   
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of right rotations: ");
        int rotations = scanner.nextInt();

        // Perform the right rotation
        rotations = rotations % size; 
        for (int i = 0; i < rotations; i++) {
            int last = numbers[size - 1];
            for (int j = size - 1; j > 0; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[0] = last;
        }

        // Print the rotated array
        System.out.println("Array after " + rotations + " right rotations:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}

