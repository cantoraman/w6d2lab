public class Book {
    private BookGenre genre;

    public Book(BookGenre genre){
        this.genre = genre;
    }

    public BookGenre getGenre() {
        return this.genre;
    }
}
