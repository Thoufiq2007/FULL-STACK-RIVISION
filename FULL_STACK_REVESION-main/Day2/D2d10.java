abstract class Shape99{
  abstract double calculateArea() ;
  void displayMessage(){
    System.out.println( "Calculating area of the shape...");
  }
}
class Circle99 extends Shape99{
  double radius=28.3;
    double calculateArea(){
    return 3.14 * radius * radius;
  }
}
public class D2d10 {
  public static void main(String[] args) {
   Circle99 obj = new Circle99();
    obj.displayMessage();
    System.out.println(obj.calculateArea());

  }
  
}
