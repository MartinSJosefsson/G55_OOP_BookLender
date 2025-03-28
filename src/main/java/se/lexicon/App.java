package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Martin", "Josefsson");
        Book book1 = new Book("Lord of the Rings", "JRR Tolkien");

        System.out.println(person1.getPersonInformation());
        System.out.println(book1.getBookInformation());
        pperson1.loanBook(book1);
        System.out.println(book1.getBookInformation());

        person1.returnBook(book1);
        System.out.println(book1.getBookInformation());
    }

}
