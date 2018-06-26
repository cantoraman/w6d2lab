import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int booksCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (stock.size() < capacity)
        this.stock.add(book);

    }

    public Book getBook() {
        return this.stock.remove(0);
    }

    public void countByGenre(){

        HashMap<BookGenre, Integer> booksByGenre = new HashMap<>();


        booksByGenre.put(BookGenre.ADVENTURE, 0);
        booksByGenre.put(BookGenre.CRIME, 0);
        booksByGenre.put(BookGenre.ROMANTIC, 0);
        booksByGenre.put(BookGenre.THRILLER, 0);
        booksByGenre.put(BookGenre.HORROR, 0);


        int x=0;


        for (Book book : this.stock) {
            booksByGenre.put(book.getGenre(),x+1);
        }

        for (Book book : this.stock) {
            System.out.println( book.getGenre() + "has" + booksByGenre.get(book.getGenre()) + "books.");
        }


    }



}
