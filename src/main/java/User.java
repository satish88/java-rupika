public class User {
     String username;
     int id ;
     public void bookIssue( String bookname){
          String booksIssued = (bookname);
          System.out.println(booksIssued);
          System.out.println(bookname + " issued to "+ this.username + " id= " + this.id);
     }
     public void bookReturn( String bookname){

          System.out.println(bookname + " returned by "+ this.username + " id= " + this.id);
     }


     public static void main(String[] args){
          User user = new User();
          user.id = 123;
          user.username = "ram";

          user.bookIssue("Premchand");
          user.bookIssue("Aam ka ped");

          user.bookReturn("Nandan");



     }
}
