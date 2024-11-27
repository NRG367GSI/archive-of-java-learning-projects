public class Book {
    String titleBook;
    Author author;
    int yearPublication;

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

}