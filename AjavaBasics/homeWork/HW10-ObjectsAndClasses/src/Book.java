import java.util.Objects;

public class Book {
    private String titleBook;
    private Author author;
    private int yearPublication;

    public Book(String titleBook, Author author, int yearPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitleBook() {
        return this.titleBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Название книги: " + getTitleBook() + "\nАвтор:" + getAuthor() + "\nГод публикации: " + getYearPublication() + "\n";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        boolean isTitleBook = Objects.equals(this.titleBook, book.titleBook);
        boolean isAuthor = Objects.equals(this.author, book.author);
        boolean isYearPublication = Objects.equals(this.yearPublication, book.yearPublication);
        return   isTitleBook && isAuthor && isYearPublication;
    }
}
