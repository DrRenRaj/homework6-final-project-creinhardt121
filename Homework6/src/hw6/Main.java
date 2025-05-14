package hw6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search by Title");
            System.out.println("5. Search by Author");
            System.out.println("6. Check Out Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter ISBN: ");
                String isbn = scanner.nextLine();
                library.addBook(new Book(title, author, isbn));
            } else if (choice == 2) {
                System.out.print("Enter ISBN to remove: ");
                String isbn = scanner.nextLine();
                library.removeBook(isbn);
            } else if (choice == 3) {
                library.displayAllBooks();
            } else if (choice == 4) {
                System.out.print("Enter title to search: ");
                String title = scanner.nextLine();
                library.searchByTitle(title);
            } else if (choice == 5) {
                System.out.print("Enter author to search: ");
                String author = scanner.nextLine();
                library.searchByAuthor(author);
            } else if (choice == 6) {
                System.out.print("Enter ISBN to check out: ");
                String isbn = scanner.nextLine();
                library.checkOutBook(isbn);
            } else if (choice == 7) {
                System.out.print("Enter ISBN to return: ");
                String isbn = scanner.nextLine();
                library.returnBook(isbn);
            } else if (choice == 8) {
                exit = true;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
