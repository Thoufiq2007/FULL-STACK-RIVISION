package Day3;
class StudentNameProcessor{
  String fullName=" rahul kumar ";

}
public class D3T19 {
  public static void main(String[] args) {
    StudentNameProcessor obj = new StudentNameProcessor();
    System.out.println(obj.fullName);
    System.out.println(obj.fullName.trim());
    System.out.println(obj.fullName.toUpperCase());
    System.out.println(obj.fullName.toLowerCase());
    System.out.println(obj.fullName.length());
    System.out.println(obj.fullName.indexOf("k"));
    System.out.println(obj.fullName.substring(4));
    System.out.println(obj.fullName.startsWith("RAHUL"));
  }
}
