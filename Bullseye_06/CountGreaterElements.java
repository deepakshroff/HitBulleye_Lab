package Bullseye_06;

import java.util.Scanner;

public class CountGreaterElements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
            
            System.out.print("Enter the size of the array (N): ");
            int N = sc.nextInt();
        
        
        if (N < 1 || N > 20) {
            System.out.println("Invalid input! N should be between 1 and 20.");
            return;
        }

        int[] Arr = new int[N];

        
        System.out.println("Enter " + N + " elements of the array:");
        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
            
            if (Arr[i] < 1 || Arr[i] > 10000) {
                System.out.println("Invalid input! Array values should be between 1 and 10000.");
                return;
            }
        }

        
        int count = 1; 
        int max_so_far = Arr[0];

       
        for (int i = 1; i < N; i++) {
            if (Arr[i] > max_so_far) {
                count++;
                max_so_far = Arr[i]; 
            }
        }

        // Print the result
        System.out.println("Output: " + count);

        }
    }

}


