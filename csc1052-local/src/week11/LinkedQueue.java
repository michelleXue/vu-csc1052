package week11;

public class LinkedQueue<T> implements Queue<T> {
    private Node front;  // front of the queue (first in line)
    private Node rear;   // end of the queue (last in line)
    private int count;

    // Sets up an initially empty queue.
    public LinkedQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    // Adds the specified element to the rear of the queue. The front
    // reference is also updated if the queue was empty.
    public void enqueue(T element) {
        Node temp = new Node(element);

        if (isEmpty())
            front = temp;
        else
            rear.next = temp;

        rear = temp;
        count++;
    }

    // Removes and returns the element at the front of the queue. The rear
    // reference is updated if there are no more elements in the list.
    public T dequeue() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException("An attempt was made to dequeue an empty queue.");

        T element = front.elem;
        front = front.next;
        count--;
        if (count == 0)  // just dequeued the only element in the queue
            rear = null;

        return element;
    }

    // Returns a reference to the element at the front of the queue, without
    // removing it from the queue.
    public T first() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException("An attempt was made to access the first " +
                                          "element of an empty queue.");

        return front.elem;
    }

    // Returns true if the queue is empty and false otherwise.
    public boolean isEmpty() {
        return count == 0;
    }

    // Gets the number of elements in the queue.
    public int size() {
        return count;
    }

    // Gets a string representation of the queue, starting at the front.
    public String toString() {
        String description;
        if (isEmpty())
            description = "The queue is empty.\n";
        else {
            description = "Queue size: " + size() + "\n";

            // Traverse the list and add each element to the description.
            Node current = front;
            while (current != null) {
                description += current.elem + "  ";
                current = current.next;
            }

            description += "\n";
        }
        return description;
    }

    // A private inner class that represents a node in the linked list.
    private class Node {
        private T elem;
        private Node next;

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
}
