public class LogHandler extends Handler {
    private InfoLogHandler infoLogHandler = new InfoLogHandler();
    private DebugLogHandler debugLogHandler = new DebugLogHandler();
    private ErrorLogHandler errorLogHandler = new ErrorLogHandler();
    
    public LogHandler(){
        errorLogHandler.setHandler(debugLogHandler);
        debugLogHandler.setHandler(infoLogHandler);
    }

    @Override
    public void process(Log log) {

        if (log.getLogLevel().equals("INFO")) {
            infoLogHandler.process(log);
        }

        if (log.getLogLevel().equals("DEBUG")) {
            debugLogHandler.process(log);
        }
        
        if(log.getLogLevel().equals("ERROR")) {
            errorLogHandler.process(log);
        }

    }
}
