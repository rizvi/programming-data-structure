package nmn.geeks.array;

import nmn.geeks.logger.LoggingDrive;

/**
 * Created by naman.nigam on 09/02/16.
 */
public class TwoSmallestNumber {

    static LoggingDrive loggingDrive = new LoggingDrive();
    public void print2Smallest(int arr[], int arr_size) {
        int i, first, second;

    /* There should be atleast two elements */
        if (arr_size < 2) {
            loggingDrive.logger.info("Invalid Input!");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (i = 0; i < arr_size; i++) {
        /* If current element is smaller than first
           then update both first and second */
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            }

        /* If arr[i] is in between first and second
           then update second  */
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            loggingDrive.logger.info("There is no second smallest element.");
        else
            loggingDrive.logger.info("The smallest element is " + first + " and second smallest element is " + second);
    }


}
