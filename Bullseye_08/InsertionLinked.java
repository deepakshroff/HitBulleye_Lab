import java.util.Scanner;

public class InsertionLinked {
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

   
    public void display() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertionLinked list = new InsertionLinked();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to insert into the linked list (type -1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.insert(input);
        }

        System.out.println("The linked list is:");
        list.display();

        scanner.close();
    }
}
