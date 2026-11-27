class Bank{
  double getIntrestrate(){
    return 0.0;
  }
}
class SBI extends Bank{
 double getIntrestrate(){
    return 6.5;
  }
}

class HDFC extends Bank{
 double getIntrestrate(){
    return 7.0;
  }
}
public class Day2Task3 {
  public static void main(String[] args) {
    SBI b1 = new SBI();
    HDFC b2 = new HDFC();
    System.out.println(b1.getIntrestrate());
      System.out.println(b2.getIntrestrate());
  }
  
}
