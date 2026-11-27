
interface Shape999{
  void CalculateArea(double side);
}
class Square999 implements Shape999{
 public void CalculateArea(double side){
    System.out.println("Square Area: " + (side * side));
  }
}
class Circle999 implements Shape999{
 public  void CalculateArea(double radius ){
    System.out.println("Circle Area: " + (3.14 * radius * radius));
  }
}
public class D2T14 {
  public static void main(String[] args) {
    Shape999 s1=new Square999();
    Shape999 s2=new Circle999();
    s1.CalculateArea(5.0);
    s2.CalculateArea(5.0);
  }
  
}
