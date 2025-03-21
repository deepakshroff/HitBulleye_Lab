package Bullseye_05;

import java.util.Scanner;

public class greater {
    
    public static void findPreviousAndNextGreater(int[] arr, int target) {
        Integer previousGreater = null;
        Integer nextGreater = null;

        for (int num : arr) {
            if (num > target) {
                if (nextGreater == null || num < nextGreater) {
                    nextGreater = num;
                }
            }
            if (num < target) {
                if (previousGreater == null || num > previousGreater) {
                    previousGreater = num;
                }
            }
        }

        System.out.println("Previous Greater: " + (previousGreater != null ? previousGreater : "None"));
        System.out.println("Next Greater: " + (nextGreater != null ? nextGreater : "None"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        findPreviousAndNextGreater(arr, target);

        scanner.close();
    }
}
