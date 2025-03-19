package Bullseye_03;

import java.util.Scanner;

public class Smallestnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

      
        int[] numbers = new int[size];

        // Take input for the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

      
        int smallest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        
        System.out.println("The smallest number in the array is: " + smallest);

        scanner.close();
    }
}
