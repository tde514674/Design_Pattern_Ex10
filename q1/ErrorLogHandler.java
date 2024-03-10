public class ErrorLogHandler extends Handler {

	@Override
	public void process(Log log) {
			System.out.println("Error Console::Logger: "+log.getLogMsg());
			super.process(log);
	}
}
