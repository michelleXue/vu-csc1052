package week6;

public class StackUnderflowException extends RuntimeException {
	public StackUnderflowException () {
		super();
	}
	
	public StackUnderflowException (String message) {
		super(message);
	}
}
