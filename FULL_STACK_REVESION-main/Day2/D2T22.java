abstract class AbstractBankAccount{
  abstract double calculateInterest();
  void displayAccountType() {
    System.out.println( "Bank Account Details");
  }
}
class SavingsAccount  extends AbstractBankAccount{
  double balance;
   double calculateInterest(){
    return balance * 0.05;
  }
}
public class D2T22 {
  public static void main(String[] args) {
    SavingsAccount obj = new SavingsAccount();
    obj.balance=50000;
    obj.displayAccountType();
    System.out.println("calculated intrest:"+obj.calculateInterest());
  }
}
