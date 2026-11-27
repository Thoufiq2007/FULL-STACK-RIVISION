class EncapsulationBankAccount{
  private String accountHolder;
  private double balance=100000;
  public EncapsulationBankAccount() {
    this.accountHolder = "Unknown";
  }
  public String getAccountHolder() {
    return accountHolder;
  }
  public void getBalance() {
    if(balance<0){
      System.out.println("invalid balance");
    }else {
    System.out.println(balance);
    }
  }
  void Deposit(double nums){
    balance +=nums;
  }
  void withdraw(double s){
    System.out.println("withdrawed "+s);
    balance -=s;
  }
}
public class Encapsulationtask2 {
  public static void main(String[] args) {
    EncapsulationBankAccount obj = new EncapsulationBankAccount();
    obj.getBalance();
    
    obj.Deposit(1000000);
    obj.withdraw(5);
    obj.getBalance();
  }
  
}
