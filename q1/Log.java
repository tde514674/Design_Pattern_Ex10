public class Log {
    private String logLevel;
    private String logMsg;
    
    public Log(String logLevel, String logMsg){
        this.logLevel = logLevel;
        this.logMsg = logMsg;
    }

    public String getLogLevel() {
        return logLevel;
    }
    public String getLogMsg() {
        return logMsg;
    }
    
}
