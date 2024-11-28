public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Преступление и наказание", author1, 1866);

        System.out.printf("Название книги: %s, Автор: %s %s, Год публикации: %d\n",
                book1.getTitleBook(), book1.getAuthor().getFirstName(), book1.getAuthor().getLastName(), book1.getYearPublication());

        Author author2 = new Author("Лев", "Толстой");

        Book book2 = new Book("Война и мир", author2, 1869);

        System.out.printf("Название книги: %s, Автор: %s %s, Год публикации: %d\n",
                book2.getTitleBook(), book2.getAuthor().getFirstName(), book2.getAuthor().getLastName(), book2.getYearPublication());

        book2.setYearPublication(1870);
        System.out.printf("Название книги: %s, Автор: %s %s, Год публикации: %d\n",
                book2.getTitleBook(), book2.getAuthor().getFirstName(), book2.getAuthor().getLastName(), book2.getYearPublication());

    }
}