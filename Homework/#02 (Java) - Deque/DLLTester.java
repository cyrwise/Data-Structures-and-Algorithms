public class DLLTester 
{

    public static void main(String[] args) 
    {
        
        // ----------
        // MY EXAMPLE
        // ----------

        DoublyLinkedList myList = new DoublyLinkedList();

        // Inserting nodes at the beginning
        System.out.println("MY EXAMPLE:");
        myList.insertAtBeginning("1");
        myList.insertAtBeginning("2");
        myList.insertAtBeginning("3");
        myList.printList(); // Expected output: 3 2 1

        // Inserting nodes at the end
        myList.insertAtEnd("4");
        myList.insertAtEnd("5");
        myList.insertAtEnd("6");
        myList.printList(); // Expected output: 3 2 1 4 5 6

        // Inserting a node before a specified node
        myList.insertBefore("0", "2");
        myList.printList(); // Expected output: 3 0 2 1 4 5 6

        // Inserting a node after a specified node
        myList.insertAfter("7", "1");
        myList.printList(); // Expected output: 3 0 2 1 7 4 5 6

        // Removing nodes
        myList.removeNode("0");
        myList.removeNode("7");
        myList.printList(); // Expected output: 3 2 1 4 5 6

        // Moving a node to the front
        myList.moveToFront("2");
        myList.printList(); // Expected output: 2 3 1 4 5 6

        // Moving a node to the end
        myList.moveToEnd("3");
        myList.printList(); // Expected output: 2 1 4 5 6 3

        // ------------------
        // ASSIGNMENT EXAMPLE
        // ------------------

        System.out.println("\n-------------------------------\n");
        DoublyLinkedList assignmentList = new DoublyLinkedList();

        // Initial list: C-> O -> M -> P -> U -> T -> E
        System.out.println("ASSIGNMENT EXAMPLE:");
        assignmentList.insertAtEnd("C");
        assignmentList.insertAtEnd("O");
        assignmentList.insertAtEnd("M");
        assignmentList.insertAtEnd("P");
        assignmentList.insertAtEnd("U");
        assignmentList.insertAtEnd("T");
        assignmentList.insertAtEnd("E");

        // 1. Print the contents of the list:
        assignmentList.printList();
        // Expected output: C O M P U T E 

        // 2. Insert M at the beginning of the list
        assignmentList.insertAtBeginning("M");
        assignmentList.printList(); 
        // Expected output: M C O M P U T E

        // 3. Insert R at the end
        assignmentList.insertAtEnd("R");
        assignmentList.printList(); 
        // Expected output: M C O M P U T E R

        // 4. Remove from the beginning
        assignmentList.removeFromBeginning();
        assignmentList.printList(); 
        // Expected output: C O M P U T E R

        // 5. Remove from the end
        assignmentList.removeFromEnd();
        assignmentList.printList(); 
        // Expected output: C O M P U T E

        // 6. Insert M before P
        assignmentList.insertBefore("M", "P");
        assignmentList.printList(); 
        // Expected output: C O M M P U T E

        // 7. Insert H before M
        assignmentList.insertBefore("H", "M");
        assignmentList.printList(); 
        // Expected output: C O H M M P U T E

        // 8. Insert B before A 
        // (there is no A so it adds at the end)
        assignmentList.insertBefore("B", "A");
        assignmentList.printList(); 
        // Expected output: C O H M M P U T E B

        // 9. Insert C after P
        assignmentList.insertAfter("C", "P");
        assignmentList.printList(); 
        // Expected output: C O H M M P C U T E B

        // 10. Insert L after M
        assignmentList.insertAfter("L", "M");
        assignmentList.printList(); 
        // Expected output: C O H M L M P C U T E B        

        // 11. Remove M
        // (removes the first one it finds)
        assignmentList.removeNode("M");
        assignmentList.printList(); 
        // Expected output: C O H L M P C U T E B

        // 12. Remove G
        // (no G to remove lol)
        assignmentList.removeNode("G");
        assignmentList.printList(); 
        // Expected output: C O H L M P C U T E B

        // 13. Move P to the front of the list
        assignmentList.moveToFront("P");
        assignmentList.printList(); 
        // Expected output: P C O H L M C U T E B

        // 14. Move L to the end of the list
        assignmentList.moveToEnd("L");
        assignmentList.printList(); 
        // Expected output: P C O H M C U T E B L
    }
}
