class Account{
  int accountnumber=12345;
  void showAccount(){

  }
}
class savingsAccount extends Account{
  double intrestrate=2.6;
  void showsavingsdetails(){
    System.out.println("saving detail "+intrestrate);
  }
}
class FinalDepositAccount extends savingsAccount{
  int lockinyears=5;
  void showfddetails(){
    System.out.println("locked in years :"+lockinyears);
  }
}
public class InhertanceTask2 {
  public static void main(String[] args) {
    FinalDepositAccount obj = new FinalDepositAccount();
    obj.showAccount();
    obj.showfddetails();
    obj.showsavingsdetails();
  }
  
}
