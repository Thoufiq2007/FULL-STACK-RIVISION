class PropertiesRectangle{
  private double length;
  private double width;
  public double getLength() {
    return length;
  }
  public void setLength(double length) {
    this.length = length;
  }
  public double getWidth() {
    return width;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public void ClaculateArea(){
    System.out.println("area:"+length*width);
  }
  public void CalculatePerimeter(){
    System.out.println("perimeter:"+2*(length+width));
  }
}
public class CalculatedProperties {
  public static void main(String[] args) {
    PropertiesRectangle obj = new PropertiesRectangle();
    obj.setLength(99);
    obj.setWidth(88);
    System.out.println( obj.getLength());
    System.out.println(obj.getWidth());
    obj.ClaculateArea();
    obj.CalculatePerimeter();
  }
  
}
