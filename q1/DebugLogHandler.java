public class DebugLogHandler extends Handler {


	@Override
	public void process(Log log) {
			System.out.println("File::Logger: "+ log.getLogMsg());
			super.process(log);
	}
}
