import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book(BookGenre.HORROR);
    }


    @Test
    public void checkGenre(){
        assertEquals(BookGenre.HORROR, book.getGenre());
    }



}
