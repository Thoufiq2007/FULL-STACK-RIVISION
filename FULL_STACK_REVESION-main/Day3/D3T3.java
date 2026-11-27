package Day3;
class TextConverter{
  String message="Welcome to java Programming";
  
  String upper=message.toUpperCase();
  String lower=message.toLowerCase();
}
public class D3T3 {
  public static void main(String[] args) {
    TextConverter obj = new TextConverter();
    System.out.println(obj.message);
    System.out.println(obj.upper);
    System.out.println(obj.lower);
  }
  
}
