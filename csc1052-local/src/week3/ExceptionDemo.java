package week3;

public class ExceptionDemo {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Trigger(true);

	}
	
	public static void Trigger (boolean trigger) throws MyException {
		if (trigger)
			throw new MyException("exception trigger is true");
	}

}
