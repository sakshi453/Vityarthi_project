Library Management System

**Overview**
The Library Management System is a robust, console-based Java application developed using Object-Oriented Programming (OOP) principles. It is designed to manage book inventories, register library members, and handle the complete borrowing and returning lifecycle efficiently.

**Features**
Book Inventory Management: Add new books, view all available and checked-out books, and track details such as ISBN, title, author, and availability status.
Member Registration: Register new library members with unique IDs and names.
Borrowing Workflow: Allow members to check out available books by referencing their unique ISBN.
Return Workflow: Facilitate seamless book returns to restore inventory availability.
Encapsulated Design: Strict data hiding using private fields paired with controlled getter and setter methods.

**Technologies Used**
Programming Language: Java (JDK 8 or higher)
Concepts Applied: Object-Oriented Programming (Encapsulation, Composition, Classes & Objects)
Version Control: Git & GitHub

**Steps to Install & Run the Project**
Clone or Download the Repository:
Download all project source files (Main.java, Library.java, Book.java, Member.java) into a single folder named Vityarthi project.
Open Terminal / IDE Terminal:
Navigate to the project directory:
cd "Vityarthi project"
Compile the Source Code:
Compile all Java files together using the Java compiler:
javac Main.java Book.java Member.java Library.java
Run the Application:
Execute the main class:
java Main


**Instructions for Testing**
Upon running java Main, a text-based menu will appear in your console.
Select Option 1 to view preloaded dummy books and members.
Select Option 2 to add a new custom book to the inventory.
Select Option 3 and enter a valid ISBN (e.g., 101) to test the borrowing workflow.
Select Option 4 to return the borrowed book.
