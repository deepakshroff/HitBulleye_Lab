package Bullseye_06;

import java.util.Scanner;

public class CruiseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of hours (T): ");
        int T = scanner.nextInt();
        
        int[] E = new int[T];
        int[] L = new int[T];
        
        
        System.out.println("Enter the number of guests entering each hour:");
        for (int i = 0; i < T; i++) {
            E[i] = scanner.nextInt();
        }
        
       
        System.out.println("Enter the number of guests leaving each hour:");
        for (int i = 0; i < T; i++) {
            L[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int currentGuests = 0;
        int maxGuests = 0;
        
        
        for (int i = 0; i < T; i++) {
            currentGuests += E[i] - L[i];
            maxGuests = Math.max(maxGuests, currentGuests);
        }
        
        // Print the maximum number of guests
        System.out.println("Maximum number of guests on the cruise: " + maxGuests);
    }
}

