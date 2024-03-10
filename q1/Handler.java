public class Handler {
	protected Handler next;

	public void setHandler(Handler handler) {
		if (next != null) {
			next.setHandler(handler);
		}
		else {
			next = handler;
		}
	}
	public void process(Log log) {
		if (next != null) {
			next.process(log);
		}
	}
}
