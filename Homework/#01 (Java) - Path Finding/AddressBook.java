import java.util.ArrayList;
import java.util.List;

public class AddressBook<E extends Person> 
{
    // A list to store Person objects
    private List<E> contactList;

    // Constructor to initialize the contact list
    public AddressBook() 
    {
        contactList = new ArrayList<>();
    }

    // Method to add a person to the contact list if not already present
    public void addContact(E contact) 
    {
        if (!contactList.contains(contact)) 
        {
            contactList.add(contact);
        }
    }

    // Method to remove a person from the contact list
    public void removeContact(E contact) 
    {
        contactList.remove(contact);
    }

    // Method for searching by first name, last name, or ID
    public List<E> findContact(String firstName, String lastName, int id) 
    {
        List<E> matchingContacts = new ArrayList<>();
        for (E contact : contactList) 
        {
            boolean matchesFirstName = firstName == null || firstName.equals(contact.gFN());
            boolean matchesLastName = lastName == null || lastName.equals(contact.gLN());
            boolean matchesId = id ==  0 || id == contact.gID();

            if (matchesFirstName && matchesLastName && matchesId) 
            {
                matchingContacts.add(contact);
            }
        }
        return matchingContacts;
    }
}
