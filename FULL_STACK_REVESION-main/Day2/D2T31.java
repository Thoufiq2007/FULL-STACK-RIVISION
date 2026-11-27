class Product{
  String productName;
  int quantity;
  double price;
  Product(){
    productName = "Unknown";
    quantity = 1;
    price = 100;
  }
  Product(String productName){
    this.productName=productName;
  }
  Product(String productName, int quantity, double price){
    this.productName=productName;
    this.quantity=quantity;
    this.price=price;
  }
  void calculateTotal(){
    System.out.println("Total Price: ₹" + (quantity * price));
  }
}
public class D2T31 {
  public static void main(String[] args) {
    Product obj=new Product();
    obj.calculateTotal();
    Product obj1=new Product("iphone");
    obj1.calculateTotal();
    Product obj2=new Product("samsung", 1, 220000);
    obj2.calculateTotal();
  }
  
}
