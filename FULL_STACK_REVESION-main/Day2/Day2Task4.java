class D2Task4Shape{
  void draw(){
    System.out.println("Drawing a shape");
  }
}
class D2Task4Circle extends D2Task4Shape{
  void draw(){
    System.out.println("drawing a Circle");
  }
}
class Square extends D2Task4Shape{
   void draw(){
    System.out.println("drawing a Square");
  }
}
public class Day2Task4 {
  public static void main(String[] args) {
    D2Task4Shape s ;
    s=new D2Task4Circle();
    s.draw();
    s=new Square();
    s.draw();
  }
}
