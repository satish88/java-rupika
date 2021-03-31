
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {


    public static void main(String[] args){
        System.out.println("Welcome to Library Management System");
        System.out.println("What do you want to do?");
        System.out.println("1. Create User");
        System.out.println("2. Enter Book Details");
        System.out.println("3. Show All Books");
        System.out.println("4. Issue Book");
        System.out.println("5.Show all Users");
        System.out.println("6. Exit");

        Library library = new Library();
        library.books = new ArrayList<>();
        library.users = new ArrayList<>();
        library.librarians = new ArrayList<>();


        while (true){
            Scanner myObj = new Scanner(System.in);
            int input = myObj.nextInt();
            System.out.println("Input is "+ input);

            if (input == 1){
                System.out.println("Please provide User details.");
                System.out.println("User name:");
                myObj = new Scanner(System.in);
                String userName = myObj.nextLine();
                System.out.println("Age:");
                myObj = new Scanner(System.in);
                int age = myObj.nextInt();
                System.out.println("Gender:");
                myObj = new Scanner(System.in);
                String Gender = myObj.nextLine();
                Library.createUser(Library.users.size()+1 , userName, age,Gender);

            }
            else if (input == 2) {
                System.out.println("Please provide book details.");
                System.out.println("Bookname");
                myObj = new Scanner(System.in);
                String bookName = myObj.nextLine();
                System.out.println("Author name");
                myObj = new Scanner(System.in);
                String authorName = myObj.nextLine();
                Library.createBook(Library.books.size()+1, bookName , authorName);
                System.out.println("Book added");

            }
            else if (input == 3) {
                for (int i = 0; i < Library.books.size(); i++) {
                    Book book = Library.books.get(i);
                    System.out.println(book.bookID + "," + book.authorName + ", " + book.bookName);
                }
            }
            else if (input == 5){
                for (int i = 0; i<Library.users.size(); i++){
                    User user = Library.users.get(i);
                    System.out.println(user.userID + "," + user.userName + ", " + user.age + ", " + user.gender);

                }

            }
            else if (input == 6) {
                System.out.println("Exiting !! Bye Bye");
                 return;
            }
        }

    }
}
