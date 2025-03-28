package Bullseye_10;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteMiddleNode {
   
    public static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null; 
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }

   
    public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The list is empty.");
            scanner.close();
            return;
        }

        System.out.println("Enter the elements of the linked list:");
        Node head = new Node(scanner.nextInt());
        Node current = head;

        for (int i = 1; i < n; i++) {
            current.next = new Node(scanner.nextInt());
            current = current.next;
        }

        System.out.println("Original Linked List:");
        displayList(head);

        head = deleteMiddle(head);

        System.out.println("Linked List after deleting the middle node:");
        displayList(head);

        scanner.close();
    }
}
