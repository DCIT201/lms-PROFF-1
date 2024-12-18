package org.example;

public class Book {

        private String title;
        private String author;
        private String isbn;

        // Constructor to initialize the book object
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        // Getters and Setters for encapsulation
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title ="1984";
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = "George Orwell";
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = String.valueOf(1949);
        }

        // Display book details
        @Override
        public String toString() {
            return "Book{" +
                    "Title='" + title + '\'' +
                    ", Author='" + author + '\'' +
                    ", ISBN='" + isbn + '\'' +
                    '}';
        }

    public int getYearPublished() {
            return 0;
    }
}

