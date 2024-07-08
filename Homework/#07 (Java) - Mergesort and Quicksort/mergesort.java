public class mergesort 
{
    // Performs a natural merge sort on a linked list.
    // Returns the headNode of the sorted linked list.
    public static node naturalMergeSort(node headNode) 
    {
        // Base case: If the list is empty or has only one node, it is already sorted.
        if (headNode == null || headNode.next == null) 
        {
            return headNode;
        }

        boolean merged;
        int iteration = 0;
        
        // Continue merging until no more merges are needed.
        while (true) 
        {
            merged = false;
            // Create a dummy node to serve as the headNode of the list being merged.
            node scallywag = new node((char) 0);
            scallywag.next = headNode;
            node tailNode = scallywag;
            node current = headNode;

            // Iterate through the list, merging adjacent sorted sequences.
            while (current != null) 
            {
                node first = current;
                // Find the last node of the first sorted sequence.
                node second = mergehelper.findLastNode(first);
                node next = second.next;

                if (next != null) 
                {
                    node third = next;
                    // Find the last node of the second sorted sequence.
                    node fourth = mergehelper.findLastNode(third);
                    current = fourth.next;
                    fourth.next = null;
                    // Merge the two sorted sequences and append the result to the tailNode.
                    tailNode.next = mergehelper.combineLists(first, second, third, fourth);
                    // Update the tailNode to the last node of the merged sequence.
                    tailNode = mergehelper.findLastNode(tailNode.next);
                    tailNode.next = current;
                    merged = true;
                } 
                else 
                {
                    // If there's no next sequence, append the remaining nodes.
                    tailNode.next = first;
                    break;
                }
            }
            // Update the headNode to the merged list.
            headNode = scallywag.next;

            // If no merges were performed, the list is sorted.
            if (!merged) break;

            iteration++;
            // Print the state of the list after each iteration.
            System.out.println("\n After iteration " + iteration + ":");
            printLinkedList(headNode);
        }
        return headNode;
    }

    // Initializes a linked list from an array of characters.
    // Returns the headNode of the initialized linked list.
    public static node initializeListFromArray(char[] values) 
    {
        // If the array is empty or null, return null.
        if (values == null || values.length == 0) 
        {
            return null;
        }

        // Create the headNode node with the first character.
        node headNode = new node(values[0]);
        node tailNode = headNode;
        // Append the remaining characters to the list.
        for (int i = 1; i < values.length; i++) 
        {
            tailNode.next = new node(values[i]);
            tailNode = tailNode.next;
        }
        return headNode;
    }

    // Prints the values of a linked list.
    public static void printLinkedList(node node) 
    {
        // Iterate through the list and print each node's value.
        while (node != null) 
        {
            System.out.print(node.val);
            // Print a space if the current node is not the last.
            if (node.next != null) System.out.print(" ");
            node = node.next;
        }
    }
}