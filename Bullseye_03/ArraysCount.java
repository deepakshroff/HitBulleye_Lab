package Bullseye_03;

import java.util.Scanner;

public class ArraysCount {
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

       
        int evenCount = 0;
        int oddCount = 0;

       
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }

        // Print the results
        System.out.println("Even numbers = " + evenCount);
        System.out.println("Odd numbers = " + oddCount);

        scanner.close();
    }
}