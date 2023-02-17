package week5;

public interface RList<E> {
    // Adds the specified element to the end of the list.
    public boolean add(E element);

    // Removes last element from the list.
    public E removeLast();

    // Returns true if list is empty
    public boolean isEmpty();

    // Gets the number of elements in the list.
    public int size();

    // Gets a string representation of the list.
    public String toString();
}

