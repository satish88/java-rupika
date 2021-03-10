import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        System.out.println("Welcome to Library Management System");
        System.out.println("What do you want to do?");
        System.out.println("1. Create User");
        System.out.println("2. Enter Book Details");
        System.out.println("3. Issue Book");
        System.out.println("4. Exit");
        System.out.println("5. Show All Books");

        Library library = new Library();
        library.books = new ArrayList<>();

        while (true) {
            // Get input from User
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            int input = myObj.nextInt();  // Read user input
            System.out.println("INput is: " + input);  // Output user input
            if (input == 1) {
                System.out.println("Create User Flow");
                User user = new User();
                user.username = "Yukti";
            } else if (input == 2) {
                // take input from user
                System.out.println("Please provide book details");
                System.out.println("Bookname");
                myObj = new Scanner(System.in);
                String bookName = myObj.nextLine();
                System.out.println("Author name");

                myObj = new Scanner(System.in);
                String author = myObj.nextLine();
                library.createBook(bookName, author, library.books.size() + 1);
            } else if (input == 4) {
                System.out.println("Exiting !! Bye Bye");
                return;
            } else if (input == 5) {

                for (int i = 0; i < library.books.size(); i++) {
                    Book book = library.books.get(i);
                    System.out.println(book.id + "," + book.authorName + ", " + book.bookName);

                }
            }
        }






    }
}
