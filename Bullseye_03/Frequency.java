package Bullseye_03;

import java.util.Scanner;

public class Frequency {
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

    
        System.out.print("Enter the number to find its frequency: ");
        int target = scanner.nextInt();

        int frequency = 0;
        for (int num : numbers) {
            if (num == target) {
                frequency++;
            }
        }

        // Print the frequency
        System.out.println("The frequency of " + target + " in the array is: " + frequency);

        scanner.close();
    }
}
