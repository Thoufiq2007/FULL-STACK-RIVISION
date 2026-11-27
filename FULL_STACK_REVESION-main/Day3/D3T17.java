package Day3;
class MessageBuilder{
  String firstName="java";
  String lastName="Developer";

}
public class D3T17 {
  public static void main(String[] args) {
    MessageBuilder obj = new MessageBuilder();
    System.out.println("welcome, "+obj.firstName.concat(obj.lastName));
  }
}
