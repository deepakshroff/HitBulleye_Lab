import java.util.Scanner;

class totalSteps1 {
    public static int totalSteps(int n) {
        if (n == 0 || n == 1) 
            return 1;
        return totalSteps(n - 1) + totalSteps(n - 2);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(totalSteps(n));
        }
    }
}

