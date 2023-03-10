package week6;

public interface StackInterface<T> {
    // Adds the specified element to the top of the stack. 
    public void push(T element);
  
    // Removes and returns the top element from the stack. 
    public T pop();

    // Returns the top element of the stack without removing it. 
    public T peek();
  
    // Returns true if this stack contains no elements and false otherwise. 
    public boolean isEmpty();

    // Gets the number of elements in the stack. 
    public int size();

    // Gets a string representation of the stack. 
    public String toString();

}
