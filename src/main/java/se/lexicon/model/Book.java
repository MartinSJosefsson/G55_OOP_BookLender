package se.lexicon.model;


public class Book {
        private String id;
        private String title;
        private String author;
        private boolean available;

        public Book(String title, String author) {
            this.id = generateBookId();
            this.title = title;
            this.author = author;
            this.available = true;
        }

        public Book(String title, String author, Person borrower) {
            this(title, author);
            this.available = false;
            System.out.println(borrower.getFirstName() + " " + borrower.getLastName() + " borrowed the book: " + this.title);
        }

        private String generateBookId() {
            return "BK" + System.currentTimeMillis();
        }

        public String getBookInformation() {
            return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + available;
        }

        public String getId() { return id; }
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public boolean isAvailable() { return available; }
        public void setAvailable(boolean available) { this.available = available; }
    }