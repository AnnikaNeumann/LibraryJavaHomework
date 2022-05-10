import org.junit.Before;
import org.junit.Test;

import javax.print.DocFlavor;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before() {
        library = new Library(3);
        book = new Book("Scent of Death", "Simon Beckett", "Horror");
        book1 = new Book("Outlander", "Diana Gabaldon", "Fantasy");
        book2 = new Book("Cruxifix", "Chris Carter", "Horror");
        book3 = new Book("Java For Dummies", "Barry Burd", "Coding");
    }

    @Test
    public void startEmptyLibrary() {
        assertEquals(0, library.bookCount());
    }


    @Test
    public void canAddNewBook() {
        library.addNewBook(book);
        library.addNewBook(book1);

        assertEquals(2, library.bookCount());
    }

    @Test
    public void noCapacityLeft(){
        library.addNewBook(book);
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);

        assertEquals(3, library.bookCount());

    }


}
