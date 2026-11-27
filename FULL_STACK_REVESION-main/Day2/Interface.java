interface PAYMENT99{
void pay();
}
class UPI implements PAYMENT99{
 public void pay(){
    System.out.println("payment done");
  }
}
public class Interface {
  public static void main(String[] args) {
    UPI obj = new UPI();
    obj.pay();
  }
  
}
