package nmn.geeks.linkedlist;

/**
 * Created by naman.nigam on 09/02/16.
 */
public class LinkedListNode {
    int data;
    public LinkedListNode next;

    // Constructor to create a new node
    public LinkedListNode(int d) {
        data = d;
        next = null;
    }

    public static LinkedListNode head;  // head of list
}