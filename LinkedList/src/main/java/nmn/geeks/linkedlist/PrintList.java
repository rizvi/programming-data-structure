package nmn.geeks.linkedlist;

import static nmn.geeks.logger.LoggingDrive.*;

/**
 * Created by naman.nigam on 09/02/16.
 */
public class PrintList {

    public static void printList(LinkedListNode listHead) {
        if (listHead == null) {
            return;
        }
        System.out.print("LinkedList : ");
        while (listHead.next != null) {
            System.out.print(listHead.data + " -> ");
            listHead = listHead.next;
        }
        logger.info(listHead.data);
    }
}