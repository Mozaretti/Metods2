import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String authorName;

    public Author(String nameAuthor, String authorName) {
        this.nameAuthor = nameAuthor;
        this.authorName = authorName;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "" +
                "  " + nameAuthor + "" +
                " " + authorName + "" +
                "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(authorName, author.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, authorName);
    }
}
