public class Log4NetAdapter implements ILogger{

    private Log4NetLogger log4NetLogger;
    @Override
    public void log(String message) {
        //Log4NetLogger log4NetLogger = new Log4NetLogger();
        log4NetLogger.logMessage(message);
    }
}
