package Bullseye_10;

import java.util.Stack;

public class stackTop {
    private Stack<Integer> stack;

    public stackTop() {
        stack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
    }

    public void pop(int count) {
        for (int i = 0; i < count && !stack.isEmpty(); i++) {
            stack.pop();
        }
    }

    public void printTop() {
        if (!stack.isEmpty()) {
            System.out.println("Top element: " + stack.peek());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public static void main(String[] args) {
        stackTop stackExample = new stackTop();
        stackExample.push(10);
        stackExample.push(54);
        stackExample.push(32);
        stackExample.push(64);
        stackExample.push(22);

        stackExample.pop(3);
        stackExample.printTop();
    }
}
