public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor to initialize a Book object
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // New books are available by default
    }

    // Getters and Setters (Encapsulation)
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to display book details
    public void displayBookInfo() {
        String status = isAvailable ? "Available" : "Borrowed";
        System.out.println("ISBN: " + isbn + " | Title: " + title + " | Author: " + author + " | Status: " + status);
    }
}