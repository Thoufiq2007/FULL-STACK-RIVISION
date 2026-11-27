class Book{
  String title;
  double price;
  Book(){
    title = "Unknown";
    price = 0.0;
  }
  Book(String title){
    this.title=title;
    price = 0.0;

  }
  Book(String title, double price){
   this.title=title;
   this.price=price;

  }
  void display(){
    System.out.println("title: "+title+"price: "+price);
  }
}
public class Task6 {
  public static void main(String[] args) {
    Book obj = new Book();
    obj.display();
     Book obj1 = new Book("alexgander");
    obj1.display();
     Book obj2 = new Book("demo",3.4);
     obj2.display();
  }
  
}
