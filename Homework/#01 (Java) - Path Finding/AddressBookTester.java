import java.util.ArrayList;
import java.util.List;

public class AddressBookTester 
{
    public static void main(String[] args) 
    {
        AddressBook<Student> studentAddressBook = new AddressBook<>();

        // Create some Student objects
        Student student1 = new Student("Genju", "Pengu",  1, new ArrayList<>(), new ArrayList<>());
        Student student2 = new Student("Bobert", "Lee",  2, new ArrayList<>(), new ArrayList<>());

        // Add students to the address book
        studentAddressBook.addContact(student1);
        studentAddressBook.addContact(student2);

        // Search for a student by first name
        List<Student> foundStudents = studentAddressBook.findContact("Alice", null,  0);
        System.out.println("Students named Bobert: " + foundStudents.size());

        // Delete a student from the address book
        studentAddressBook.removeContact(student1);
        System.out.println("Student deleted.");


        // Search again to verify the student was removed
        foundStudents = studentAddressBook.findContact("Alice", null,  0);
        System.out.println("Students named Bobert: " + foundStudents.size());
    }
}