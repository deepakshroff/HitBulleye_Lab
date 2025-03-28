package Bullseye_10;

import java.util.Stack;

public class EvaluatePostfix {
    public static void main(String[] args) {
        String expression = "23*54*+"; // Hardcoded postfix expression

        try {
            int result = evaluatePostfix(expression);
            System.out.println("The result of the postfix expression is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to int
            } else if (isOperator(ch)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid postfix expression.");
                }
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a, b, ch));
            } else {
                throw new IllegalArgumentException("Invalid character in expression: " + ch);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression.");
        }

        return stack.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int applyOperator(int a, int b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero.");
                }
                return a / b;
            default: throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}
