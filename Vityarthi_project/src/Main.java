import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Preloading initial dummy data for quick testing
        library.addBook(new Book("101", "Java Programming", "James Gosling"));
        library.addBook(new Book("102", "Data Structures 101", "Alice Smith"));
        library.addMember(new Member("M01", "John Doe"));

        int choice;
        do {
            System.out.println("\n=== Library Management System Menu ===");
            System.out.println("1. View All Books");
            System.out.println("2. Add a New Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(isbn, title, author));
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String borrowIsbn = scanner.nextLine();
                    library.borrowBook(borrowIsbn);
                    break;
                case 4:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;
                case 5:
                    System.out.println("Exiting system. Have a great day!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}