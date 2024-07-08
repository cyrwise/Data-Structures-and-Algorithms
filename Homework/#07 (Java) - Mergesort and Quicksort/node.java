public class node 
{
    // Reference to the next node in the linked list.
    node next;
    // The value stored in this node.
    char val;

    // Constructor that initializes a node with a given value and sets the next node to null.
    public node(char value) 
    {
        // Calls the overloaded constructor with the value and null as the next node.
        this(value, null);
    }

    // Overloaded constructor that initializes a node with a given value and a reference to the next node.
    public node(char value, node next) 
    {
        // Sets the value of this node.
        this.val = value;
        // Sets the reference to the next node in the list.
        this.next = next;
    }
}