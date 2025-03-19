package Bullseye_03;

import java.util.Scanner;

public class arraysSum {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        //  print the result
        System.out.println("The sum of the elements in the array is: " + sum);

        scanner.close();
    }
}
