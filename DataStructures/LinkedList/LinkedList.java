package DataStructures.LinkedList;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head;
    int count;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * @param list
     * @param data
     */
    public static void insert(LinkedList list, int data) {

        // Create new Node
        Node newNode = createNode(data);

        // Check is list head is null
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;

            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    /**
     * @param list
     */
    public static void delete(LinkedList list) {

        Node temp = list.head;

        if (list.head == null) {
            System.out.println("LinkedList is empty");
        } else {
            int i = 0;
            // Traverse till list (len - 1) position
            while (i < list.count - 1) {
                temp = temp.next;
                i++;
            }

            // Update the next to null

            temp.next = null;

        }
    }

    /**
     * @param list
     * @param position
     * @return
     */
    public static boolean deleteByPosition(LinkedList list, int position) {

        Node temp = list.head;

        if (position == 0 || position > list.count) {
            System.out.println("Invalid Position");
            return false;
        } else if (position == 1) {
            list.head = temp.next;
            temp.next = null;
        } else {
            int i = 1;

            while (i < position - 1) {
                temp = temp.next;
                i++;
            }

            // Update the reference(link) of position -1 Node
            Node temp1 = temp.next;
            temp.next = temp1.next;


            // Make pos Node reference(link) as null
            temp1.next = null;
        }
        return true;
    }

    /**
     * @param list
     * @param data
     * @param position
     */
    public static void insertAt(LinkedList list, int data, int position) {

        // Create Node
        Node newNode = createNode(data);

        if (position == 0 || position > list.count) {
            System.out.println("Invalid position");
        } else if (position == 1) {
            newNode.next = list.head;
            list.head = newNode;
        } else {

            // Traverse till position and add node

            Node temp = list.head;
            int i = 1;

            while (i < position - 1) {
                temp = temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
    }


    /**
     * @param list
     */
    public static void printList(LinkedList list) {
        Node currentNode = list.head;

        System.out.println("Linked List");

        while (currentNode != null) {
            System.out.println("Node(Data: " + currentNode.data + ", next: " + currentNode.next + ")");
            currentNode = currentNode.next;
        }
    }

    /**
     * @param data
     * @return
     */
    public static Node createNode(int data) {
        return new Node(data);
    }

    /**
     * @param list
     */
    public static void reverseList(LinkedList list) {

        // Initialize pointers
        Node previousNode = null;
        Node currentNode = list.head, nextNode = list.head;

        // Traverse through list and update pointers
        while (nextNode != null) {
            nextNode = nextNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        list.head = previousNode;
    }

    public void getLength() {
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);

        printList(list);

        list.getLength();

        System.out.println(list.count);

        System.out.println("After inserting");

        insertAt(list, 100, 4);

        printList(list);

        System.out.println("Deleting last node \n");

        delete(list);

        printList(list);

        if (deleteByPosition(list, 5)) {
            printList(list);
        }

        System.out.println("After reversing list \n");


        reverseList(list);

        printList(list);
    }
}