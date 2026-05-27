import java.util.Arrays;

public class BookSuggestionTest {

    static int passed = 0;
    static int failed = 0;

    static void setUp() {
        BookSuggestionSystem.books.clear();
        BookSuggestionSystem.books.addAll(Arrays.asList("The Hobbit", "The Mystery", "Animal Farm"));
    }

    static void check(String testName, boolean condition) {
        if (condition) {
            System.out.println("  PASS: " + testName);
            passed++;
        } else {
            System.out.println("  FAIL: " + testName);
            failed++;
        }
    }


    static void testAddNewBook() {
        setUp();
        BookSuggestionSystem.addBook("Brave Kingdom");
        check("Add new book", BookSuggestionSystem.books.contains("Brave Kingdom"));
    }

    static void testAddDuplicateBook() {
        setUp();
        BookSuggestionSystem.addBook("The Hobbit");
        long count = BookSuggestionSystem.books.stream().filter(b -> b.equals("The Hobbit")).count();
        check("Duplicate not added", count == 1);
    }

    public static void main(String[] args) {
        System.out.println("===== Book Suggestion System Tests =====\n");

        System.out.println("[ ADD BOOK ]");
        testAddNewBook();
        testAddDuplicateBook();

        System.out.println("\n[ REMOVE BOOK ]");
        testRemoveExistingBook();
        testRemoveBookNotInList();

        System.out.println("\n[ UPDATE BOOK ]");
        testUpdateExistingBook();
        testUpdateBookNotInList();

        System.out.println("\n[ SHOW ALL BOOKS ]");
        testShowAllBooksCount();
        testShowAllBooksContent();

        System.out.println("Passed: " + passed + " | Failed: " + failed);
    }
}
