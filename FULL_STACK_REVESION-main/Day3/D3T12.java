package Day3;
class FormValidator{
  String name="";

}
public class D3T12 {
  public static void main(String[] args) {
    FormValidator obj = new FormValidator();
    if(obj.name.isEmpty()){
      System.out.println("name is required");
    }else {
      System.out.println("name submitted successfully");
    }
  }
  
}
