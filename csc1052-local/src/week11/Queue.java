package week11;

public interface Queue<T> {
    // Adds the specified element to the end of the queue.
    public void enqueue(T element);

    // Removes and returns the element at the front of the queue.
    public T dequeue();

    // Returns the element at the front of the queue without removing it.
    public T first();

    // Returns true if this queue contains no elements and false otherwise.
    public boolean isEmpty();

    // Gets the number of elements in the queue.
    public int size();

    // Gets a string representation of the queue.
    public String toString();
}
