package Day3;
class NameExtractor{
  String fullName="java full stack Developer";
}
public class D3T9 {
  public static void main(String[] args) {
    NameExtractor obj = new NameExtractor();
    System.out.println(obj.fullName.substring(0,4 ));
    System.out.println(obj.fullName.substring(5, 9));
    System.out.println(obj.fullName.substring(10));
  }
  
}
