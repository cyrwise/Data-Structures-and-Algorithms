public class mergesortTester 
{
    public static void main(String[] args) 
    {
        // Create an instance of the mergesort class to access its methods.
        mergesort natty = new mergesort();
        
        // Define the Thanarray
        char[] values = {'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        
        // Initialize a linked list from the array of characters and get the head of the list.
        node head = natty.initializeListFromArray(values);

        // Print the unsorted list.
        System.out.println("Unsorted list");
        natty.printLinkedList(head);
        
        // Perform a natural merge sort on the linked list and update the head to the sorted list.
        head = natty.naturalMergeSort(head);
    }
}