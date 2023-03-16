public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Николай", "Гоголь");
        Book book1 = new Book("Идиот", author1, 1869);
        Book book2 = new Book("Вий", author2, 1835);
        System.out.println("Книга - " + book1.getBookName() + "." + " Автор - " + author1.getNameAuthor() +
                " " + author1.getAuthorName() + "." + " Год - " + book1.getYear());
        System.out.println("Книга - " + book2.getBookName() + "." + " Автор - " + author2.getNameAuthor() +
                " " + author2.getAuthorName() + "." + " Год - " + book2.getYear());
        book2.setYear(1856);
        System.out.println("Книга - " + book2.getBookName() + "." + " Автор - " + author2.getNameAuthor() +
                " " + author2.getAuthorName() + "." + " Год - " + book2.getYear());
        System.out.println(book1);
        System.out.println(book2);
    }
}