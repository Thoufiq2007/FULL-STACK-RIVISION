package Day3;
class EmailValidation{
  String email="studentkingsofmcg@gmail.com";

}
public class D3T18 {
  public static void main(String[] args) {
    EmailValidation obj = new EmailValidation();
    if(obj.email.isEmpty()&& obj.email.contains("@") && obj.email.endsWith(".com") && obj.email.startsWith("student")){
      System.out.println("valid email");
    }else {
      System.out.println("invalid email");
    }
  }
  
}
