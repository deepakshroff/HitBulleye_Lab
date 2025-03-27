package Bullseye_09;

public class DeletionLinked {

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


    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

    
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

     
        if (temp.next == null) {
            System.out.println("Value not found in the list.");
            return;
        }

        temp.next = temp.next.next;
    }

 
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
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
        DeletionLinked list = new DeletionLinked();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        System.out.println("Deleting 20:");
        list.delete(20);
        list.display();

        System.out.println("Deleting 50 (not in list):");
        list.delete(50);
        list.display();
    }
}
