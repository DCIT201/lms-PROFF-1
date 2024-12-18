package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;    // List of books in the library
    private ArrayList<Patron> patrons; // List of patrons in the library

    // Constructor to initialize Library
    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Remove a book from the library by ISBN
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book with ISBN " + isbn + " removed.");
    }

    // Display all books
    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Add a patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added: " + patron);
    }

    // Display all patrons
    public void displayPatrons() {
        System.out.println("Library Patrons:");
        for (Patron patron : patrons) {
            System.out.println(patron);
        }
    }
}
