public class NumberPatternRecursion {
    public static void printPattern(int n) {
        if (n == 0) {
            return;
        }
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        printPattern(n - 1);
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
