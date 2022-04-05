package DataStructures.LinkedList;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node() {

        }

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private static Node createNode(int data) {
        return new Node(data);
    }

    /**
     * Inserts new node to the Linked-list
     *
     * @param data
     * @param list
     * @return LinkedList
     */
    private static LinkedList insert(int data, LinkedList list) {

        // Create new Node
        Node newNode = createNode(data);
        ;
        newNode.next = null;

        // Check if list is empty
        if (list.head == null) {
            list.head = newNode;
        } else {

            // Traverse the list and add new Node

            Node last = list.head;

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

        System.out.println("Linked list : ");

        int i = 0;
        while (currentNode != null) {
            System.out.println("Node" + i + "(Data : " + currentNode.data + ", next : " + currentNode.next + ")");
            i++;
            currentNode = currentNode.next;
        }
    }

    /**
     * Insert new node at specific position
     *
     * @param position
     * @param data
     * @param list
     */
    private static void insertAt(int position, int data, LinkedList list) {

        // Create new node
        Node newNode = createNode(data);

        // Check if list is empty
        if (list.head == null) {
            list.head = newNode;
        } else if (position < 1) {
            // If position is less than 1
            System.out.println("Please select position greater than 1");
        } else if (position == 1) {
            // If list has only one node
            // Insert new node before head node
            newNode.next = list.head;
            list.head = newNode;
        } else {
            Node tempNode = list.head;

            // Traverse till position -1 node
            for (int i = 1; i < position - 1; i++) {
                if (tempNode != null) {
                    tempNode = tempNode.next;
                }
            }

            // Assign newNode next as tempNode next address
            newNode.next = tempNode.next;
            tempNode.next = newNode;

        }
    }

    /**
     * Returns reversed Linked-list
     *
     * @param list
     * @return LinkedList
     */
    private static LinkedList reverseList(LinkedList list) {

        // Create 3 pointers
        Node previousNode = null;
        Node currentNode = list.head;
        Node nextNode = list.head;

        while (nextNode != null) {
            nextNode = nextNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        list.head = previousNode;

        return list;
    }

    /**
     * Add Two linked-list
     *
     * @param l1
     * @param l2
     * @return Node
     */

    private static Node addTwoNumbers(Node l1, Node l2) {

        int v1 = 0, v2 = 0, sum = 0, carry = 0;
        Node sumHead = new Node(-1);
        Node ptr = sumHead;

        while (l1 != null || l2 != null) {

            if (l1 != null) {
                v1 = l1.data;
                l1 = l1.next;
            } else v1 = 0;

            if (l2 != null) {
                v2 = l2.data;
                l2 = l2.next;
            } else v2 = 0;

            sum = v1 + v2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            ptr.next = new Node(sum);
            ptr = ptr.next;
        }

        if (carry != 0) {
            ptr.next = new Node(carry);
        }
        return sumHead.next;
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        for (int i = 1; i < 5; i++) {
            insert(i, list);
        }

        print(list);

        System.out.println("----------------InsertAt----------------------");

        insertAt(3, 100, list);

        print(list);

        System.out.println("----------------ReverseList----------------------");

        reverseList(list);

        print(list);

        System.out.println("----------------Add Two Numbers----------------------");

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        insert(9, list1);
        insert(9, list1);
        insert(9, list1);
        insert(9, list1);
        insert(9, list1);
        insert(9, list1);
        insert(9, list1);


        insert(9, list2);
        insert(9, list2);
        insert(9, list2);
        insert(9, list2);


        print(list1);
        print(list2);

        Node l1 = list1.head;
        Node l2 = list2.head;

        Node n = addTwoNumbers(l1, l2);

        while (n != null) {
            System.out.print(n.data);
            n = n.next;
        }


    }
}
