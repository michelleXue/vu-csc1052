package week6;

import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T> {
	
	private final static int DEFAULT_CAPACITY = 20; 
    private int top; 
    private T[] stack; 

	public ArrayStack() {
		top = -1; // empty stack at the beginning
		stack = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	
	@Override
	public void push(T element) {
        if (size() == stack.length)
            stack = Arrays.copyOf(stack, stack.length * 2);

        top++;
        stack[top] = element;		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() throws StackUnderflowException {
		if (isEmpty())
            throw new StackUnderflowException();

        return stack[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top+1;
	}
	
    // Gets a string representation of the stack.
    public String toString() {
        String description;
        if (isEmpty())
            description = "The stack is empty.";
        else {
            description = "There are " + size() + " elements in the stack:\n";
            for (int i = top; i >= 0; i--)
                description += stack[i] + "\n";
        }
        return description;
    }

}
