

import java.util.Stack;

public class PrefixEvaluation2 {

    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();
      
        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);
            
           
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to int
            } else {
              
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                
                // Perform the operation
                switch (ch) {
                    case '+': stack.push(operand1 + operand2); break;
                    case '-': stack.push(operand1 - operand2); break;
                    case '*': stack.push(operand1 * operand2); break;
                    case '/': stack.push(operand1 / operand2); break;
                    case '^': stack.push((int) Math.pow(operand1, operand2)); break;
                }
            }
        }
        // The result will be at the top of the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefixExpression = "-+23*456";  
        int result = evaluatePrefix(prefixExpression);
        System.out.println("Result: " + result);
    }
}
