import java.util.Scanner;

public class FactorialRecursion {
    
    public static long sum (int n) {
        if (n == 1) { 
            return 1;
        }
        return n + sum (n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + sum (num));
        }
        
        scanner.close(); 
    }
}

