
public class OutputException extends Exception {

	String output;

	public OutputException (StackTraceElement [] stacktrace)
	{
		super();
		this.setStackTrace(stacktrace);
	}
	
	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
}
