import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books;
    public List<User> users;


    public void createUser() {

    }

    public void createBook(String bookName, String authorName, int id) {
        Book book = new Book();
        book.bookName = bookName;
        book.authorName = authorName;
        book.id = id;
        books.add(book);
    }

    public static void main(String[] args) {
        System.out.println("What do you want to do?");
        // Create User - 1
        // Enter Book - 2
        // Issue Book - 3




        Librarian jyoti = new Librarian();



        Book book2 = new Book();
        book2.bookName = "HBC";


        Library library = new Library();
        library.books = new ArrayList<>();

        library.createBook("PremChand", "rupika", 1);
        library.books.add(book2);

        for (int i = 0; i < library.books.size(); i++) {
            Book book = library.books.get(i);
            System.out.println(book.bookName);

        }






        User user = new User();
        user.username = "Yukti";

    }
}
