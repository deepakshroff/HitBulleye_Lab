import java.util.Scanner;

class factorialprogram1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i; // Multiply the factorial by i
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
        
        sc.close(); // Close the scanner to prevent memory leaks
    }
}
