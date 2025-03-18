public class NumberPyramid1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Move to next line
            System.out.println();
        }
    }
}

