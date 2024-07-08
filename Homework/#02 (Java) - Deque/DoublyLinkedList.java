public class DoublyLinkedList 
{
    private DoubleNode head;
    private DoubleNode tail;

    // Inner class representing a node in the doubly linked list
    private class DoubleNode 
    {
        String item;
        DoubleNode prev;
        DoubleNode next;

        // Constructor for a new node
        DoubleNode(String item) 
        {
            this.item = item;
        }
    }

    public DoublyLinkedList() 
    {
        head = null;
        tail = null;
    }

    // ---------------------------------------------------------------------------------------

    // PRINT LIST
    // Method to print the list

    // ---------------------------------------------------------------------------------------

    public void printList() 
    {
        DoubleNode current = head;
        while (current != null) 
        {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    // ---------------------------------------------------------------------------------------

    // INSERT AT BEGINNING
    // Method to insert a new node at the beginning of the list

    // ---------------------------------------------------------------------------------------

    public void insertAtBeginning(String item) 
    {
        DoubleNode newNode = new DoubleNode(item);
        if (head == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // ---------------------------------------------------------------------------------------

    // INSERT AT END
    // Method to insert a new node at the end of the list

    // ---------------------------------------------------------------------------------------

    public void insertAtEnd(String item) 
    {
        DoubleNode newNode = new DoubleNode(item);
        if (tail == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // ---------------------------------------------------------------------------------------

    // REMOVE FROM BEGINNING
    // Method to remove a node from the beginning of the list

    // ---------------------------------------------------------------------------------------

    public void removeFromBeginning() 
    {
        if (head != null) 
        {
            head = head.next;
            if (head != null) 
            {
                head.prev = null;
            } 
            else 
            {
                tail = null;
            }
        }
    }

    // ---------------------------------------------------------------------------------------

    // REMOVE FROM END
    // Method to remove a node from the end of the list

    // ---------------------------------------------------------------------------------------

    public void removeFromEnd() 
    {
        if (tail != null) 
        {
            tail = tail.prev;
            if (tail != null) 
            {
                tail.next = null;
            } 
            else 
            {
                head = null;
            }
        }
    }

    // ---------------------------------------------------------------------------------------

    // INSERT BEFORE
    // Method to insert a new node before a specified node

    // ---------------------------------------------------------------------------------------

    public void insertBefore(String item, String value) 
    {
        DoubleNode newNode = new DoubleNode(item);
        if (head == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            DoubleNode current = head;
            while (current != null && !current.item.equals(value)) 
            {
                current = current.next;
            }
            if (current == null) 
            {
                insertAtEnd(item);
            } 
            else 
            {
                newNode.next = current;
                newNode.prev = current.prev;
                if (current.prev != null) 
                {
                    current.prev.next = newNode;
                } 
                else 
                {
                    head = newNode;
                }
                current.prev = newNode;
            }
        }
    }

    // ---------------------------------------------------------------------------------------

    // INSERT AFTER
    // Method to insert a new node after a specified node

    // ---------------------------------------------------------------------------------------

    public void insertAfter(String item, String value) 
    {
        DoubleNode newNode = new DoubleNode(item);
        if (head == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            DoubleNode current = head;
            while (current != null && !current.item.equals(value)) 
            {
                current = current.next;
            }
            if (current == null) 
            {
                insertAtEnd(item);
            } 
            else 
            {
                newNode.prev = current;
                newNode.next = current.next;
                if (current.next != null) 
                {
                    current.next.prev = newNode;
                } 
                else 
                {
                    tail = newNode;
                }
                current.next = newNode;
            }
        }
    }

    // ---------------------------------------------------------------------------------------

    // REMOVE NODE
    // Method to remove a node with a specific value

    // ---------------------------------------------------------------------------------------

    public void removeNode(String value) 
    {
        DoubleNode current = head;
        while (current != null) 
        {
            if (current.item.equals(value)) 
            {
                if (current.prev != null) 
                {
                    current.prev.next = current.next;
                } 
                else 
                {
                    head = current.next;
                }
                if (current.next != null) 
                {
                    current.next.prev = current.prev;
                } 
                else 
                {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    // ---------------------------------------------------------------------------------------

    // MOVE TO FRONT
    // Method to move a node with a specific value to the front of the list

    // ---------------------------------------------------------------------------------------

    public void moveToFront(String value) 
    {
        DoubleNode current = head;
        while (current != null) 
        {
            if (current.item.equals(value)) 
            {
                if (current.prev != null) 
                {
                    current.prev.next = current.next;
                } 
                else 
                {
                    head = current.next;
                }
                if (current.next != null) 
                {
                    current.next.prev = current.prev;
                } 
                else 
                {
                    tail = current.prev;
                }
                current.next = head;
                current.prev = null;
                head.prev = current;
                head = current;
                return;
            }
            current = current.next;
        }
    }

    // ---------------------------------------------------------------------------------------

    // MOVE TO END
    // Method to move a node with a specific value to the end of the list

    // ---------------------------------------------------------------------------------------

    public void moveToEnd(String value) 
    {
        DoubleNode current = head;
        while (current != null) 
        {
            if (current.item.equals(value)) 
            {
                if (current.prev != null) 
                {
                    current.prev.next = current.next;
                } 
                else 
                {
                    head = current.next;
                }
                if (current.next != null) 
                {
                    current.next.prev = current.prev;
                } 
                else 
                {
                    tail = current.prev;
                }
                current.next = null;
                current.prev = tail;
                tail.next = current;
                tail = current;
                return;
            }
            current = current.next;
        }
    }
}
