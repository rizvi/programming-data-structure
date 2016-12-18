package nmn.geeks.driver;
import nmn.geeks.logger.LoggingDrive;

/**
 * Created by naman.nigam on 08/02/16.
 */
public class AllowedDriver {

    /***
     * Method to run every bit of code
     *
     * @param args not passed as of now
     */
    public static void main(String[] args) {
        LoggingDrive.loggingOutput();
        DriveArray.LevelOne();
        nextModule();
        DriveGraph.LevelOne();
        nextModule();
        DriveLinkedList.LevelOne();
        nextModule();
        DriveQueue.LevelOne();
        nextModule();
        DriveStack.LevelOne();
        nextModule();
        DriveString.LevelOne();
        nextModule();
        DriveTree.LevelOne();
        nextLevel();
    }

    /***
     * Divider between output from different problems
     */
    static void nextProblem() {
        LoggingDrive.logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }


    /***
     * Divider between output from different modules
     */
    private static void nextModule() {
        LoggingDrive.logger.info("=================================================================");
    }

    /***
     * Divider between different levels
     */
    private static void nextLevel() {
        LoggingDrive.logger.info("-----------------------------------------------------------------");
    }
}