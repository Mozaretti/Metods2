public class Book {
    private String bookName;
    private Author bookAuthor;
    private int year;

    public Book(String bookName, Author bookAuthor, int year) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
