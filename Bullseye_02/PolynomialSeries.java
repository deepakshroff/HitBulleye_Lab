public class PolynomialSeries {
    public static int evaluateSeries(int x, int n) {
        int sum = 0;
        int term = 1; 
        
        for (int i = 0; i < n; i++) {
            sum += term;  
            term *= x;    
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println("Output: " + evaluateSeries(x, n));
    }
}
