class Task8Payment {
  void pay(double amount){
    System.out.println("Processing generic payment of ₹" + amount);
  }
}
class Task8CreditCard extends Task8Payment{
 void pay(double amount){
  System.out.println( "Paid ₹ " + amount + " via Credit Card");
 }
} 
class Task8UPI extends Task8Payment{
void pay(double amount){
  System.out.println( "Paid ₹" + amount + " via UPI");
 }
}
public class Task8 {
  public static void main(String[] args) {
Task8Payment[] payments={new Task8CreditCard(),new Task8UPI() };
    for (int i=0;i<payments.length;i++){
      payments[i].pay(500.0);
    }

  }
  
}
