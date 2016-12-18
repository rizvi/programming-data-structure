package nmn.geeks.driver;

import nmn.geeks.linkedlist.CompareTwoStringListLexicographically;
import nmn.geeks.linkedlist.LinkedListNode;
import nmn.geeks.linkedlist.PrintList;
import nmn.geeks.linkedlist.RearrangeInPlace;
import java.util.LinkedList;

/**
 * Created by naman.nigam on 09/02/16.
 */
class DriveLinkedList {

    static void LevelOne() {

        /** http://www.geeksforgeeks.org/compare-two-strings-represented-as-linked-lists */
        LinkedList<String> stringList1 = new LinkedList<>();
        stringList1.add("g");
        stringList1.add("e");
        stringList1.add("e");
        stringList1.add("k");
        stringList1.add("a");
        LinkedList<String> stringList2 = new LinkedList<>();
        stringList2.add("g");
        stringList2.add("e");
        stringList2.add("e");
        stringList2.add("k");
        stringList2.add("s");
        CompareTwoStringListLexicographically.compareLinkedList(stringList1, stringList2);

        AllowedDriver.nextProblem();


        LinkedListNode list = new LinkedListNode(0);
        LinkedListNode.head = new LinkedListNode(1);
        LinkedListNode.head.next = new LinkedListNode(2);
        LinkedListNode.head.next.next = new LinkedListNode(3);
        LinkedListNode.head.next.next.next = new LinkedListNode(4);
        LinkedListNode.head.next.next.next.next = new LinkedListNode(5);

        PrintList.printList(LinkedListNode.head); // print original list
        RearrangeInPlace.rearrange(LinkedListNode.head); // rearrange list as per ques
        PrintList.printList(LinkedListNode.head); // print modified list
    }

}