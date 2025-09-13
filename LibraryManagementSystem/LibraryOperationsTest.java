package library_management_system;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryOperationsTest {

    @Test
    public void testAddAndBorrowBook() {
        Library lib = new Library(10);
        Book b1 = new Book("Java Basics", "Author A", "ISBN123");
        lib.addBook(b1);

        assertEquals("ISBN123", lib.books[0].ISBN);
        assertTrue(lib.books[0].isAvailable());

        lib.borrowBook("ISBN123");
        assertFalse(lib.books[0].isAvailable());
    }

    @Test
    public void testReturnBook() {
        Library lib = new Library(10);
        Book b1 = new Book("Java Basics", "Author A", "ISBN123");
        lib.addBook(b1);
        lib.borrowBook("ISBN123");
        lib.returnBook("ISBN123");

        assertTrue(lib.books[0].isAvailable());
    }
}












