abstract class Delivery{
  void acceptOrder(){
  System.out.println("Delivery order accepted");
  }
  abstract void deliverProduct();
}
class FoodDelivery extends Delivery{
  void deliverProduct(){
    System.out.println("Food order delivered to customer");
  }
} 
class ParcelDelivery extends Delivery{
  @Override
  void deliverProduct() {
    System.out.println("Parcel delivered successfully");
    
  }
}
public class D2T24 {
  public static void main(String[] args) {
    FoodDelivery f1= new FoodDelivery();
    ParcelDelivery f2=new ParcelDelivery();
    f1.acceptOrder();
    f1.deliverProduct();
    f2.acceptOrder();
    f2.deliverProduct();
  }
  
}
