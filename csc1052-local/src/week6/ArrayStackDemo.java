package week6;

public class ArrayStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// interface polymorphysm
		StackInterface<String> myStack2 = new LinkedStack<String>();
		StackInterface<String> myStack = new ArrayStack<String>();

        System.out.println(myStack);

        myStack.push("Lucy");

        System.out.println(myStack);

        myStack.push("Ricky");
        myStack.push("Fred");
        myStack.push("Ethel");

        System.out.println(myStack);

        String popElement = myStack.pop();
        System.out.println("Just popped: " + popElement + "\n");

        myStack.pop();  // return value ignored

        System.out.println(myStack);

        
        System.out.println("Top element: " + myStack.peek() + "\n");

        myStack.push("Ricky Jr.");

        System.out.println(myStack);

        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println(myStack);
	}

}
