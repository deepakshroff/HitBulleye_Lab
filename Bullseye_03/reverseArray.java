package Bullseye_03;

import java.util.Scanner;

public class reverseArray {
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

       
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

     
        for (int i = 0; i < size / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }

     
        System.out.println("Reversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
