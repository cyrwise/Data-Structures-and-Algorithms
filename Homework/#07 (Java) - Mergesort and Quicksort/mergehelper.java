public class mergehelper 
{
    // Finds the last node in a sorted sequence starting from the given node.
    // It assumes that the list is sorted in ascending order.
    public static node findLastNode(node current)
    {
        // Iterate through the list until the next node is null or its value is greater than the current node's value.
        while (current.next != null && current.val <= current.next.val) 
        {
            current = current.next;
        }
        // Return the last node in the sorted sequence.
        return current;
    }

    // Combines two sorted lists into a single sorted list.
    // The method takes four nodes: the first node of the first list, the last node of the first list,
    // the first node of the second list, and the last node of the second list.
    // It merges the two lists into a single sorted list and returns the first node of the merged list.
    
    public static node combineLists(node first, node second, node third, node fourth) 
    {
        // Create a dummy node to serve as the head of the merged list.
        node dummyHead = new node((char) 0);
        node currentTail = dummyHead;
        // Set the next of the second and fourth nodes to null to mark the end of their sequences.
        second.next = null;
        fourth.next = null;

        // Iterate through both lists until one of them is exhausted.
        while (first != null && third != null) 
        {
            // Compare the values of the first nodes of both lists.
            if (first.val <= third.val) 
            {
                // If the value of the first list is smaller, append it to the merged list.
                currentTail.next = first;
                first = first.next;
            } 
            else 
            {
                // Otherwise, append the node from the third list.
                currentTail.next = third;
                third = third.next;
            }
            // Move to the next position in the merged list.
            currentTail = currentTail.next;
        }

        // Append the remaining nodes from either list.
        if (first != null) 
        {
            currentTail.next = first;
        } 
        else if (third != null) 
        {
            currentTail.next = third;
        }

        // Return the merged list, excluding the dummy head.
        return dummyHead.next;
    }
}