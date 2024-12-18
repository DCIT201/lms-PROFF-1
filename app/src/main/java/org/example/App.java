/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        // Initialize Library
        Library library = new Library();

        // Create and add Books
        Book book1 = new Book("1984", "George Orwell", "12345");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "67890");
        library.addBook(book1);
        library.addBook(book2);

        // Display Books
        library.displayBooks();

        // Remove a Book
        library.removeBook("12345");
        library.displayBooks();

        // Create and add Patrons
        Patron patron1 = new Patron("Alice", 1);
        Patron patron2 = new Patron("Bob", 2);
        library.addPatron(patron1);
        library.addPatron(patron2);

        // Display Patrons
        library.displayPatrons();
    }
}

