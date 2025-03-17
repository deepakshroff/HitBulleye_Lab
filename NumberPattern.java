public class NumberPattern {
    public static void main(String[] args) {
        int num = 15; // Starting number
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
