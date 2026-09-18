import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    // Constructor initializes the lists
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    // Add a member to the library
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully: " + member.getName());
    }

    // Display all books
    public void displayAllBooks() {
        System.out.println("\n--- Library Book Inventory ---");
        if (books.isEmpty()) {
            System.out.println("No books found in the library.");
        } else {
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }

    // Borrow a book using its ISBN
    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Success! You have borrowed: " + book.getTitle());
                } else {
                    System.out.println("Error: Sorry, this book is currently checked out.");
                }
                return;
            }
        }
        System.out.println("Error: Book with ISBN " + isbn + " not found.");
    }

    // Return a book using its ISBN
    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Success! Book returned: " + book.getTitle());
                } else {
                    System.out.println("Error: This book was not checked out.");
                }
                return;
            }
        }
        System.out.println("Error: Book with ISBN " + isbn + " not found.");
    }
}