class Shape{
  String color = "black";
  void displayColor(){
    System.out.println("color: "+color);
  }
}
class Circle extends Shape{

void CalculateArea(){
double radius=88.8;
System.out.println("area of circle:"+ (Math.PI*radius*radius));

}
}
class HierarchyRectangle extends Shape{
  double length=99.9;
  double width=88.2;
void CalculateArea(){
System.out.println("Rectangle Area:"+(length*width));
}
}
public class HirachyInheritance {
  public static void main(String[] args) {
    HierarchyRectangle obj = new HierarchyRectangle();
    Circle obj1 =new Circle();
    obj.CalculateArea();
    obj1.CalculateArea();
  }
  
}
