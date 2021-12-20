package DataStructures;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /**
     * Inserts new node to the Linked-list
     *
     * @param list
     * @param data
     * @return
     */
    private static LinkedList insert(LinkedList list, int data) {

        // Create new Node
        Node newNode = new Node(data);
        newNode.next = null;

        // Check if list is empty
        // If yes then make this node as head node
        if (list.head == null) {
            list.head = newNode;
        } else {
            // traverse till last node and add new node
            Node last = list.head;

            // Last(data, next = Node2) = head
            // Node2(data, next)

            while (last.next != null) {
                last = last.next;
            }

            // Add new node after last node
            last.next = newNode;
        }

        return list;
    }

    /**
     * Prints the Linked-list
     *
     * @param list
     */
    private static void print(LinkedList list) {

        Node currentNode = list.head;

        System.out.println("LinkedList : ");

        int index = 0;
        while (currentNode != null) {
            System.out.println("Node" + index + "(Data: " + currentNode.data + ", Next: " + currentNode.next + ")");
            currentNode = currentNode.next;
            index++;
        }
    }

    public static void main(String[] args) {

        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // Insert the values
        for (int i = 0; i < 5; i++) {
            insert(list, i);
        }

        // Print the list
        print(list);

    }


}
