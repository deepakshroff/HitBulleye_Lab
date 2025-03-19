public class NumberPattern {
    public static void main(String[] args) {
        int num = 21; 
        int rows = 6; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
