package Bullseye_03;

import java.util.Scanner;

public class SearchElementArray {
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

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

     
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                found = true;
                break;
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}
