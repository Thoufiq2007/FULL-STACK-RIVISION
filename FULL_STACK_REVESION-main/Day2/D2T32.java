class Book11{
  int bookId;
  String title;
  String author;
  Book11(int bookId, String title){
    this.bookId=bookId;
    this.title=title;
  }
  Book11(int bookId, String title, String author){
    this.bookId=bookId;
    this.title=title;
    this.author=author;
  }
  void displayBook(){
    System.out.println("bookID:"+bookId);
    System.out.println("title:"+title);
    System.out.println("author:"+author);
  }
}
public class D2T32 {
  public static void main(String[] args) {
    Book11 obj = new Book11(11, "Story of india");
    Book11 obj1=new Book11(123, "Demon slayer", "kishu");
    obj.displayBook();
    System.out.println();
    obj1.displayBook();
  }
  
}
