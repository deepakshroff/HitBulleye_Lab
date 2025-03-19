package Bullseye_03;

import java.util.Scanner;

public class largenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[size];

      
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the largest number
        int largest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print the largest number
        System.out.println("The largest number in the array is: " + largest);

        scanner.close();
    }
}