class Printer {
  void print(String text){
    System.out.println("Text:"+text);
  }
  void print(int num){
    System.out.println("INTEGER:"+num);
  }
  void print(double decimal){
    System.out.println("Decimal:"+decimal);
  }
}
public class Day2Task2 {
  public static void main(String[] args) {
    Printer obj = new Printer();
    obj.print("thi is text");
    obj.print(88);
    obj.print(0.298390);
  
  }
  
}
