package Problems.Java;

import DataStructures.LinkedList.Java.LinkedList;

/**
 * Given a singly linked list, find the middle of the linked list.
 * For example, if the given linked list is 1->2->3->4->5 then the output should be 3.
 * If there are even nodes, then there would be two middle nodes,
 * we need to print the second middle element.
 * For example, if given linked list is 1->2->3->4->5->6 then the output should be 4.
 */

public class FindMiddle {

    static LinkedList list;
    static LinkedList.Node node;

    public static void main(String[] args) {

        list = new LinkedList();

        LinkedList.insert(list, 1);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 4);
        LinkedList.insert(list, 5);
        LinkedList.insert(list, 6);
        LinkedList.printList(list);

        System.out.println(list.getLength(list));

        findMiddleElement();

    }

    /**
     * Finds the middle Node of the LinkedList
     */
    public static void findMiddleElement() {

        int position = list.getLength(list) / 2;

        node = list.head;
        int i = 1;

        while (i <= position) {
            node = node.next;
            i++;
        }

        System.out.println("Middle Element of Linked list \n");
        System.out.println("Node(Data: " + node.data + ", Next: " + node.next + ")");

    }

}
