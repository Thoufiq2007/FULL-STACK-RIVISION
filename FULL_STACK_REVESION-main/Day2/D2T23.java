abstract class Payment{
  double amount;
  Payment(double amount){
    this.amount=amount;
  }
  void showAmount(){
    System.out.println("Payment Amount: ₹" + amount);
  }
  abstract void processPayment();
}
class UPIPayment extends Payment{
  UPIPayment(){
    super(500000);
  }
  void processPayment(){
    System.out.println("Payment processed successfully using UPI");
  }
}
public class D2T23 {
  public static void main(String[] args) {
    UPIPayment obj = new UPIPayment();
    obj.showAmount();
    obj.processPayment();
  }
  
}
