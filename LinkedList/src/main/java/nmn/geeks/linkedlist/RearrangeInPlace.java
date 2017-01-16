package nmn.geeks.linkedlist;

import static nmn.geeks.logger.LoggingDrive.*;

/**
 * Created by naman.nigam on 09/02/16.
 */
public class RearrangeInPlace {

    public static void rearrange(LinkedListNode LinkedListNode) {
        /***
         * Find the middle point using tortoise and hare method
         */
        LinkedListNode slow = LinkedListNode, fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        /***
         * Split the linked list in two halves
         * LinkedListNode1, head of first half    1 -> 2 -> 3
         * LinkedListNode2, head of second half   4 -> 5
         */
        LinkedListNode LinkedListNode1 = LinkedListNode;
        LinkedListNode LinkedListNode2 = slow.next;
        slow.next = null;

        // Reverse the second half, i.e., 5 -> 4
        LinkedListNode2 = ReverseList.reverselist(LinkedListNode2);

        //  Merge alternate LinkedListNodes
        LinkedListNode = new LinkedListNode(0); // Assign dummy LinkedListLinkedListNode

        /**
         * curr is the pointer to this dummy LinkedListLinkedListNode, which will
         * be used to form the new list
         */
        LinkedListNode current = LinkedListNode;
        while (LinkedListNode1 != null || LinkedListNode2 != null) {
            // First add the element from first list
            if (LinkedListNode1 != null) {
                current.next = LinkedListNode1;
                current = current.next;
                LinkedListNode1 = LinkedListNode1.next;
            }

            // Then add the element from second list
            if (LinkedListNode2 != null) {
                current.next = LinkedListNode2;
                current = current.next;
                LinkedListNode2 = LinkedListNode2.next;
            }
        }

        // Assign the head of the new list to head pointer
        LinkedListNode = LinkedListNode.next;
        logger.info("Linked List Rearranged In Place!");
    }
}