package Day3;
import java.util.Scanner;
class ShoppingCart{
  String arr[]={"laptop","Mobile","headphones","keyboard","Mouse"};

}
public class D3T23 {
  public static void main(String[] args) {
    Scanner data = new Scanner(System.in);
    ShoppingCart obj=new ShoppingCart();
    int num=data.nextInt();
    try{
      System.out.println(obj.arr[num]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("enter a valid number you entered wrong number "+e);
    }
     data.close();
  }
 
}
