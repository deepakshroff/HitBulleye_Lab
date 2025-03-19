package Bullseye_03;

import java.util.Scanner;

public class swapTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

       
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap the two numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the numbers after swapping
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}