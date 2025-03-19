package Bullseye_03;

import java.util.Scanner;

public class Static {
    public static void main(String[] args) {
        
        int[] numbers = new int[8];
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter 8 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        System.out.println("The elements in the array are:");
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}
