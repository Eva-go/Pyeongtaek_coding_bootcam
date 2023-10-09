package Day8;

public class Book {
    private String bookTitle;
    private String author;
    private int price;

    public Book(String bookTitle, String author, int price) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "북 타이틀"+bookTitle+'\''+
                ",작가 ='" + author + '\''+
                ",가격="+price+
                '}';
    }
}
