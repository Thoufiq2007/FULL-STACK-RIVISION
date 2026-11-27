package Day3;
import java.util.Scanner;

class OrderProcessing{
  String productName="laptop";
  String quantity="2";
  double [] productPrices={45000,55000,65000};
 

}
public class D3T31 {
  public static void main(String[] args) {
    int qun = 0;
    double temp = 0;
    OrderProcessing obj = new OrderProcessing();
    Scanner sc=new Scanner(System.in);
  try{
   qun=Integer.parseInt(obj.quantity);
  }catch(NumberFormatException e){
    System.out.println(e);
  }
  System.out.println("Enter anumber to product position");
  int num=sc.nextInt();
  try{
   temp =obj.productPrices[ num];
   System.out.println("total amount:"+qun*temp);
  }catch(ArrayIndexOutOfBoundsException e){
    System.out.println(e);
  }
  finally{
    
    System.out.println("Order Processing Completed");
  }
  }
  
}
