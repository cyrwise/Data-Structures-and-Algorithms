public class Stack<T> 
{
    // Declaration of a private Node class to represent the elements in the stack
    private Node<T> top;

    // Constructor for the Node class, initializing the data of the node
    private static class Node<T> 
    {
        T data; // Data stored in the node
        Node<T> next; // Reference to the next node in the stack

        // Constructor for the Node class, taking data as a parameter
        public Node(T data) 
        {
            this.data = data; // Assigning the data to the node
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() 
    {
        return top == null; // Returns true if the top node is null (stack is empty)
    }

    // Method to push data onto the stack
    public void push(T data) 
    {
        Node<T> newNode = new Node<>(data); // Create a new node with the given data
        newNode.next = top; // Set the new node's next reference to the current top node
        top = newNode; // Set the new node as the top node
    }

    // Method to pop data from the stack
    public T pop() 
    {
        if (isEmpty()) // Check if the stack is empty
        { 
            throw new IllegalStateException("Error: Stack is empty"); // Throw an exception if the stack is empty
        }
        T data = top.data; // Store the data of the top node
        top = top.next; // Set the next node as the new top node
        return data; // Return the popped data
    }

    // Method to peek at the top element of the stack without removing it
    public T top() 
    {
        if (isEmpty()) 
        { 
            throw new IllegalStateException("Error: Stack is empty"); // Throw an exception if the stack is empty
        }
        return top.data; // Return the data of the top node
    }
}
