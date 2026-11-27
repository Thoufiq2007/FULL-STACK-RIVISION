class ConstructorRectangle{
  double length;
  double width;
  ConstructorRectangle(){
    length=1.0;
    width=1.0;
  }
  ConstructorRectangle(double side){
    length=side;
    width=side;
  }
  ConstructorRectangle(double length,double width){
    this.length=length;
    this.width=width;
  }
  void CalculateArea(){
    System.out.println("Area:"+(length*width));
  }
}
public class D2T19 {
  public static void main(String[] args) {
    ConstructorRectangle obj=new ConstructorRectangle();
    obj.CalculateArea();
     ConstructorRectangle obj1=new ConstructorRectangle(22.2);
    obj1.CalculateArea();
     ConstructorRectangle obj3=new ConstructorRectangle(99.2,88.2);
    obj3.CalculateArea();

  }
  
}
