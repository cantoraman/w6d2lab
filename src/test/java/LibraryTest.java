import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void before(){
        library = new Library(9);
        book = new Book(BookGenre.HORROR);
        book2 = new Book(BookGenre.ROMANTIC);
        book3 = new Book(BookGenre.ROMANTIC);
        book4 = new Book(BookGenre.ADVENTURE);
        book5 = new Book(BookGenre.ROMANTIC);
        book6 = new Book(BookGenre.THRILLER);
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
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        library.getBook();
        library.countByGenre();
        assertEquals(6, library.booksCount());
    }



}
