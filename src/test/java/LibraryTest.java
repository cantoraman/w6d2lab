import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book(BookGenre.HORROR);
    }

    @Test
    public void numberOfBooks(){
        assertEquals(0, library.booksCount());
    }
    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.booksCount());
    }

    @Test
    public void checkCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.booksCount() );
    }

    @Test
    public void getBook(){
        library.addBook(book);
        library.addBook(book);
        library.getBook();
        assertEquals(1, library.booksCount());
    }

}
