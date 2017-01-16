package nmn.geeks.driver;

import nmn.geeks.logger.LoggingDrive;

import static nmn.geeks.driver.Print.*;
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
        levelOne();
    }

    private static void levelOne() {
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

    private static void levelTwo() {

    }

    private static void levelThree() {

    }

    private static void levelFour() {

    }

    private static void levelFive() {

    }

}