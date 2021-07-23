import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {
    public Log() {
        DOMConfigurator.configure("log4j.xml");
    }

    static Logger logger = Logger.getLogger(Log.class);

    public void info(String message) {
        logger.info(message);
    }

    public void warn(String message) {
        logger.warn(message);
    }

    public void error(String message) {
        logger.error(message);
    }
}
