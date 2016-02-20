package nmn.geeks.driver;
import nmn.geeks.logger.LoggingDrive;

/**
 * Created by naman.nigam on 08/02/16.
 */
public class AllowedDriver {
    static DriveArray driveArray = new DriveArray();
    static DriveGraph driveGraph = new DriveGraph();
    static DriveLinkedList driveLinkedList = new DriveLinkedList();
    static DriveString driveString = new DriveString();
    static DriveTree driveTree = new DriveTree();
    static DriveStack driveStack = new DriveStack();
    static DriveQueue driveQueue = new DriveQueue();
    static LoggingDrive loggingDrive = new LoggingDrive();

    /***
     * Method to run every bit of code
     *
     * @param args not passed as of now
     */
    public static void main(String[] args) {
        loggingDrive.loggingOutput();
        driveArray.LevelOne();
        nextModule();
        driveGraph.LevelOne();
        nextModule();
        driveLinkedList.LevelOne();
        nextModule();
        driveQueue.LevelOne();
        nextModule();
        driveStack.LevelOne();
        nextModule();
        driveString.LevelOne();
        nextModule();
        driveTree.LevelOne();
        nextLevel();
    }

    /***
     * Divider between output from different problems
     */
    public static void nextProblem() {
        loggingDrive.logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }


    /***
     * Divider between output from different modules
     */
    public static void nextModule() {
        loggingDrive.logger.info("=================================================================");
    }

    /***
     * Divider between different levels
     */
    public static void nextLevel() {
        loggingDrive.logger.info("-----------------------------------------------------------------");
    }
}
