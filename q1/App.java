public class App {
    public static void main(String[] args) {
        Log log = null;
        LogHandler logHandler = new LogHandler();
        
        log = new Log("INFO","This is an information."); 
        logHandler.process(log);
        System.out.println("----------------------------------------------");
        log = new Log("DEBUG", "This is a debug information.");
        logHandler.process(log);
        System.out.println("----------------------------------------------");
        log = new Log("ERROR", "This is an error information.");
        logHandler.process(log);
        System.out.println("----------------------------------------------");
    }
}
