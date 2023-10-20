public class TestBook
{
        public static void main(String[] args)
        {
            Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
            Book book2 = new Book("Преступление и наказание", "Федор Достоевский", 1866);

            System.out.println(book1);
            System.out.println(book2);

            book1.setPublicationYear(1870);
            book2.setTitle("Идиот");

            System.out.println(book1);
            System.out.println(book2);

        }
}
