import java.util.Objects;

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

    @Override
    public String toString() {
        return "Книга " +
                "- " + bookName + "" +
                ", Автор - " + bookAuthor +
                ", Год - " + year + ""
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, year);
    }
}
