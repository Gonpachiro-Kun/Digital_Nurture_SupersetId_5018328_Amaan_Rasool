public class TestLogger {
    public static void main(String[] args) {
        // Attempt to get two instances of the Logger
        Logger logger1 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        // Log some messages
        logger3.check("This is the first log message.");
        logger1.check("This is the second log message.");

        // Check if both instances are the same
        if (logger1 == logger3) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}