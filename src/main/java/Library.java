import java.util.ArrayList;

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
}
