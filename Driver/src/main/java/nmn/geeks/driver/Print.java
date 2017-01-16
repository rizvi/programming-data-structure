package nmn.geeks.driver;

import static nmn.geeks.logger.LoggingDrive.*;

/**
 * Created by naman.nigam on 16/01/17.
 */
class Print {
    /***
     * Divider between output from different problems
     */
    static void nextProblem() {
        logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    /***
     * Divider between output from different modules
     */
    static void nextModule() {
        logger.info("================================================================");
    }

    /***
     * Divider between different levels
     */
    static void nextLevel() {
        logger.info("----------------------------------------------------------------");
    }
}