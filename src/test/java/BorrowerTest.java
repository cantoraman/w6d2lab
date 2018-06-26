import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book = new Book(BookGenre.HORROR);
        library.addBook(book);
    }


    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.collectionCount());
    }
}
