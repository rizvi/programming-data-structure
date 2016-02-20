package nmn.geeks.linkedlist;
import nmn.geeks.logger.LoggingDrive;

import java.util.LinkedList;

/**
 * Created by naman.nigam on 09/02/16.
 */
public class CompareTwoStringListLexicographically {

    static LoggingDrive loggingDrive = new LoggingDrive();

    public static void compareLinkedList(LinkedList<String> linkedList1, LinkedList<String> linkedList2) {
        if (linkedList1.size() > linkedList2.size()) {
            loggingDrive.logger.info("1");
        } else if (linkedList2.size() > linkedList1.size()) {

            loggingDrive.logger.info("-1");
        } else {

            int i = 0;

            while (i < linkedList1.size()) {
                CompareTwoStringListLexicographically.compare(linkedList1.get(i), linkedList2.get(i));
                i++;
            }

        }
    }

    public static void compare(String a, String b) {
        if (a.charAt(0) == b.charAt(0)) {
            loggingDrive.logger.info("Result is :  0. String " + a + " is lexiographically equal to " + b);
        } else if (a.charAt(0) > b.charAt(0)) {
            loggingDrive.logger.info("Result is :  1. String " + a + " is lexiographically greater than " + b);
        } else {
            loggingDrive.logger.info("Result is : -1. String " + b + " is lexiographically greater than " + a);
        }
    }
}
