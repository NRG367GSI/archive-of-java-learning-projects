public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Преступление и наказание", author1, 1866);

        Author author2 = new Author("Лев", "Толстой");
        Book book2 = new Book("Война и мир", author2, 1869);

        System.out.println(book1.toString());
        System.out.println(book2.toString());


        System.out.println(book1.equals(book1));


        System.out.println(author1.hashCode());

    }
}