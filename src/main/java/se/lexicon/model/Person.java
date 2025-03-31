package se.lexicon.model;
/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private int getNextId() {
        return sequencer++;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(firstName + " " + lastName + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book is not available for loan.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(firstName + " " + lastName + " returned the book: " + book.getTitle());
    }

    public String getPersonInformation() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}



