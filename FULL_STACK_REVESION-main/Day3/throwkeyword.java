package Day3;

public class throwkeyword {
  public static void main(String[] args) {
    int age=13;
    if(age<18){
      throw new  ArithmeticException("Access denied!");
    }else {
      System.out.println("access granted !");
    }
  }
}
