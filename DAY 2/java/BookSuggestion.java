import java.util.ArrayList;
import java.util.Scanner;

public class BookSuggestionSystem {

    static ArrayList<String> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        books.add("The Hobbit");
        books.add("The Mystery");
        books.add("Animal Farm");
        books.add("Brave Kingdom");
        books.add("1984");

        System.out.println("Welcome to the Book Suggestion System!");

        while (true) {
            System.out.println("\n1. Get Suggestions");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Update Book");
            System.out.println("5. Show All Books");
            System.out.println("6. Exit");
            System.out.print("Enter operation: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                suggestBook();
            } else if (choice.equals("2")) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                addBook(title);
            } else if (choice.equals("3")) {
                System.out.print("Enter book title to remove: ");
                String title = scanner.nextLine();
                removeBook(title);
            } else if (choice.equals("4")) {
                System.out.print("Enter old title: ");
                String oldTitle = scanner.nextLine();
                System.out.print("Enter new title: ");
                String newTitle = scanner.nextLine();
                updateBook(oldTitle, newTitle);
            } else if (choice.equals("5")) {
                showAllBooks();
            } else if (choice.equals("6")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option, try again.");
            }
        }
    }

    static void suggestBook() {
        int randomIndex = (int) (Math.random() * books.size());
        int randomPage  = (int) (Math.random() * 100) + 1;
        System.out.println("Book Title: " + books.get(randomIndex));
        System.out.println("Page: " + randomPage);

        System.out.print("Would you like another suggestion? (yes/no): ");
        String answer = scanner.nextLine();

        while (answer.equals("yes")) {
            randomIndex = (int) (Math.random() * books.size());
            randomPage  = (int) (Math.random() * 100) + 1;
            System.out.println("Book Title: " + books.get(randomIndex));
            System.out.println("Page: " + randomPage);
            System.out.print("Would you like another suggestion? (yes/no): ");
            answer = scanner.nextLine();
        }
    }

    static void addBook(String title) {
        if (books.contains(title)) {
            System.out.println("Book already exists!");
        } else {
            books.add(title);
            System.out.println("Book added successfully!");
        }
    }

    static void removeBook(String title) {
        if (books.contains(title)) {
            books.remove(title);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    static void updateBook(String oldTitle, String newTitle) {
        if (books.contains(oldTitle)) {
            int index = books.indexOf(oldTitle);
            books.set(index, newTitle);
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    static void showAllBooks() {
        System.out.println("All Books:");
        for (int books = 0; All < books.size(); Boss++) {
            System.out.println((Books + 1) + ". " + books.get(Books));
        }
    }
}
