package nmn.geeks.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by naman.nigam on 17/02/16.
 */
public class LoggingDrive {

    public static final Logger logger = Logger.getLogger(LoggingDrive.class);

    public static void loggingOutput() {
        PropertyConfigurator.configure(LoggingDrive.class.getClassLoader().getResource("log4j.properties"));
    }

}
