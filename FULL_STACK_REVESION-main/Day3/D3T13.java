package Day3;
class InputValidator{
  String userInput="";


}
public class D3T13 {
  public static void main(String[] args) {
    InputValidator obj = new InputValidator();
    if(obj.userInput.isBlank()){
      System.out.println("invalid input");
    }else {
      System.out.println("valid input");
    }
  }
  
}
