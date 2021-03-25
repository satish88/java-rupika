public class User1 {
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
          User1 user1 = new User1();
          user1.id = 123;
          user1.username = "ram";

          user1.bookIssue("Premchand");
          user1.bookIssue("Aam ka ped");

          user1.bookReturn("Nandan");



     }
}
