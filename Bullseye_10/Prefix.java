package Bullseye_10;

import java.util.Stack;

public class Prefix {
    
    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        
        // Traverse the expression from right to left
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            
            if (isOperator(token)) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = applyOperator(token, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || 
               token.equals("/") || token.equals("^");
    }

    private static int applyOperator(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "^":
                return (int) Math.pow(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String expression = "- ^ 2 3 * 4 5 6";
        int result = evaluatePrefix(expression);
        System.out.println("Result of prefix evaluation: " + result);
    }
}
