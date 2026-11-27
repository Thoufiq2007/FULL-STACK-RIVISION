package Day3;
class onlinePayment{
  String paymentAmount="2500";
}
public class D3T25 {
  public static void main(String[] args) {
    onlinePayment obj = new onlinePayment();
    
    try{
     Double amount=Double.parseDouble(obj.paymentAmount);
     System.out.println(amount);
    }
    catch(NumberFormatException e){
      System.out.println("not a valid number"+e);
    }
    obj.paymentAmount="1500.50";
  
     try{
     Double amount=Double.parseDouble(obj.paymentAmount);
       System.out.println(amount);
    }
    catch(NumberFormatException e){
      System.out.println("not a valid number"+e);
    }
    obj.paymentAmount="abc";
     try{
     Double amount=Double.parseDouble(obj.paymentAmount);
       System.out.println(amount);
    }
    catch(NumberFormatException e){
      System.out.println("not a valid number"+e);
    }
    obj.paymentAmount="25xyz";
     try{
     Double amount=Double.parseDouble(obj.paymentAmount);
       System.out.println(amount);
    }
    catch(NumberFormatException e){
      System.out.println("not a valid number"+e);
    }
  }
}
