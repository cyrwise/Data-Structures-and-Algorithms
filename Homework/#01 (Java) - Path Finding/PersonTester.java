public class PersonTester 
{    
    // Test works by testing Andy and Professor with the constructor class
    public static void main(String[] args) 
    {
        // Me and Thana created
        Person person1 = new Person("Andy", "Le", 1000);
        Person person2 = new Person("Denero", "John", 1001);

        // Getter method test
        System.out.println("First Name of person1: " + person1.gFN());
        System.out.println("Last Name of person1: " + person1.gLN());
        System.out.println("ID of person1: " + person1.gID());

        // Print method test
        System.out.println("Printing First Name of person2:");
        person2.pFN();
        System.out.println("Printing Last Name of person2:");
        person2.pLN();
        System.out.println("Printing ID of person2:");
        person2.pID();

        // toString method test
        System.out.println("toString() output for person1: " + person1.toString());
        System.out.println("toString() output for person2: " + person2.toString());
    }
    
}