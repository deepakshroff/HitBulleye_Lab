import java.math.BigInteger;

public class FactorialExample {
  
    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // Number to calculate factorial
        BigInteger result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
