public class NLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("logged {0}"+message);
    }
}
