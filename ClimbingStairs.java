public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3; // Total steps to reach the top
        System.out.println("Distinct ways to climb to the top: " + countWays(n));
    }

    public static int countWays(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1; 
        if (n == 2) return 2; 

        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
