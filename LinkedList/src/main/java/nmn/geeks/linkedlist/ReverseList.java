package nmn.geeks.linkedlist;

/**
 * Created by naman.nigam on 09/02/16.
 */
public class ReverseList {

    public static LinkedListNode reverselist(LinkedListNode LinkedListNode) {
        LinkedListNode prev = null, curr = LinkedListNode, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        LinkedListNode = prev;
        return LinkedListNode;
    }
}
