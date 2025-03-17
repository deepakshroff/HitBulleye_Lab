public class loop {
    public static void main(String[] args) {
        int number = 1;
        
        // Outer loop for rows
        for (int r = 1; r <= 5; r++) {
            // Inner loop for columns
            for (int c = 1; c <= r; c++) {
                System.out.print(number + " ");
                number++;
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

