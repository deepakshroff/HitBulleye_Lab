public class LetterPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print letters from A onwards
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println(); // Move to next line
        }
    }
}

