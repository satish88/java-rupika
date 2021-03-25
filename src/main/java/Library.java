import java.util.List;

public class Library {
    public static List<Book>books;
    public static List<User>users;
    public static List<Librarian>librarians;

    public static void createBook(  int bookID, String bookName, String authorName){
        Book book = new Book();
        book.bookID = bookID;
        book.bookName = bookName;
        book.authorName = authorName;
        //book.availablityStatus = availabilityStatus;
        books.add(book);
    }

    public static void createUser(int userID, String userName, int age, String gender){
        User user = new User();
        user.userID = userID;
        user.userName = userName;
        user.age = age;
        user.gender = gender;
        users.add(user);
    }

    public static void createLibrarian(int librarianID, String librarianName,int age, String gender){
        Librarian librarian = new Librarian();
        librarian.librarianID = librarianID;
        librarian.librarianName = librarianName;
        librarian.age = age;
        librarian.gender = gender;
    }

}
