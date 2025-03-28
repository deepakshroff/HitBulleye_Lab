package Bullseye_10;

import java.util.Stack;

public class infix {
    
    public static int evaluateInfix(String expression) {
        String postfix = infixToPostfix(expression);
        return evaluatePostfix(postfix);
    }

    private static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    private static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push((int) c - 'A' + 1); // Example: A=1, B=2, etc.
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        String expression = "(A*B)/C";
        System.out.println("Result: " + evaluateInfix(expression));
    }
}
