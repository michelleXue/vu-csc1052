package week6;

public class Node<T> {
    public T elem;     // the element stored in the node
    public Node next;  // the reference to the next node in the list

    // Stores the element and sets the next reference to null.
    public Node(T element) {
        this(element, null);
    }

    // Stores the element and sets the next reference to the node specified.
    public Node(T element, Node next) {
        this.elem = element;
        this.next = next;
    }
}
