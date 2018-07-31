import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    @Before
    public void before(){
        library = new Library("Edinburgh", 1 );
        book1 = new Book();

    }
    @Test
    public void bookCount(){
        assertEquals(0, library.countBookStock());
    }

    @Test
    public void add(){
        library.addBook(book1);
        assertEquals(1,library.countBookStock());
    }

    @Test
    public void checkIfFull(){
        assertEquals(true, library.canAddBook());
    }

    @Test
    public void checkIfBookAddedFullStock(){
        library.addBook(book1);
        assertEquals(1, library.countBookStock());
        library.addBook(book1);
        assertEquals(1, library.countBookStock());
    }




}
