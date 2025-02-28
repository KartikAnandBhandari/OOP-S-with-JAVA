final class Logger {
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}
public class FinalClassDemo {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("This is a log message.");
    }
}
