public class InfoLogHandler extends Handler {
	

	@Override
	public void process(Log log) {
			System.out.println("Standard Console::Logger: "+ log.getLogMsg());
			super.process(log);
	}
}
